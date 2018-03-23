import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;


import com.sun.corba.se.impl.orbutil.concurrent.Mutex;
/*
		 * capture the statements to be executed in a hashmap
		 * 
		 */
		/*
		 * Receive all the parameters of criticalSection and create mutex out of them 
		 */
public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
	
	Map<String, Integer> memory = new HashMap<String, Integer>();
	Map<String, String> memoryStr = new HashMap<String, String>();
	Map<String, Integer> dataType = new HashMap<String, Integer>();
	Map<String, List<LabeledExprParser.StatContext>> treeMap = new HashMap<String, List<LabeledExprParser.StatContext>>();
	HashMap<String, Mutex> muMap = new HashMap<String, Mutex>();
	HashSet<Tasks> critical = new HashSet<Tasks>();
	
	private final int INTEGERTYPE = 0;
	private final int STRINGTYPE = 1;
	boolean strType = false;
	private EvalVisitorString evalVisitorString = new EvalVisitorString();
	
	int count = 0;
	int countStat = 0;

	@Override
	public Integer visitAssignInt(LabeledExprParser.AssignIntContext ctx)
	{
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		memory.put(id, value);
		dataType.put(id, INTEGERTYPE);
		return value;
	}
	
	@Override
	public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx)
	{
		System.out.print(visit(ctx.expr()));
		return 0; 
	}
	
	@Override
	public Integer visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx)
	{
		Integer value = visit(ctx.expr());
		System.out.println(value);
		return 0;
	}
	
	@Override
	public Integer visitInt(LabeledExprParser.IntContext ctx)
	{
		return Integer.valueOf(ctx.INT().getText());
	}
	
	@Override
	public Integer visitId(LabeledExprParser.IdContext ctx)
	{
		String id = ctx.ID().getText();
		if(memory.containsKey(id)) return memory.get(id);
		else if (memoryStr.containsKey(id)){
			strType = true;
		}
		return 0;
	}
	
	@Override
	public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx)
	{
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType()==LabeledExprParser.MUL)
			return left*right;
		return left/right;
	}
	
	@Override
	public Integer visitAddSub(LabeledExprParser.AddSubContext ctx)
	{
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType()==LabeledExprParser.ADD)
			return left+right;
		return left-right;
	}
	
	@Override
	public Integer visitCndExpr(LabeledExprParser.CndExprContext ctx)
	{
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if (ctx.op.getType()==LabeledExprParser.EQC){
			if(left==right)
			{
				return 1;
			}
		}
		else if (ctx.op.getType()==LabeledExprParser.NEQ){
			if(left!=right)
				{
					return 1;
				}
		}
		else{
			System.out.println("Invlid conditional Expression");
		}
		return 0;
	}
	
	@Override
	public Integer visitIfStat(LabeledExprParser.IfStatContext ctx)
	{
		int left = visit(ctx.condExpr());
		int right = visit(ctx.expr());
		if (left==1)
		{
			System.out.println(right);
			return right;
		}
		return 0;
	}
	
	
	@Override
	public Integer visitParens(LabeledExprParser.ParensContext ctx)
	{
		return visit(ctx.expr());
	}
	
	@Override
	public Integer visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx)
	{		
		String value = ctx.STR().getText();
		evalVisitorString.visitPrintStrExpr(value);
		return 0;
	}	
	
	@Override
	public Integer visitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx)
	{		
		String value = ctx.STR().getText();
		evalVisitorString.visitPrintlnStrExpr(value);
		return 0;
	}
	
	@Override
	public Integer visitAssignStr(LabeledExprParser.AssignStrContext ctx)
	{	
		String id = ctx.ID().getText();
		String value = ctx.STR().getText();
		evalVisitorString.visitAssignStr(id, value);
		memoryStr.put(id, value);
		dataType.put(id, STRINGTYPE);
		return 0;
	}
	
	@Override 
	public Integer visitAnotherParallelStruct(LabeledExprParser.AnotherParallelStructContext ctx)
	{ 
		return visitChildren(ctx); 
	}
	
	@Override public Integer visitNewTask(LabeledExprParser.NewTaskContext ctx) 
	{ 
		treeMap.put(ctx.ID().getText(), ctx.stat());
		visit(ctx.critSecParams());
		/*
		 * TODO - This is it.. the apocalypse
		 */
		//visit(ctx.stat(1));
		return 1;  
	}
	
	@Override
	public Integer visitCriticalSectionWithParams(LabeledExprParser.CriticalSectionWithParamsContext ctx)
	{
		String value = ctx.params().getText();
		Utility utility = new Utility();
		ArrayList<String> list = utility.parseData(value);
		/*
		 * capture the statements to be executed in a hashmap
		 */
		LabeledExprParser.NewTaskContext nt = (LabeledExprParser.NewTaskContext) ctx.getParent();
		String taskName = nt.ID().getText();
		
		critical.add(new Tasks(ctx.stat(), list, ++count, taskName));		
		return 1;
	}
	
	@Override 
	public Integer visitSharedParams(LabeledExprParser.SharedParamsContext ctx) 
	{ 
		/*
		 * Receive all the parameters of criticalSection and create mutex out of them 
		 */
		String value = ctx.params().getText();
		Utility ut = new Utility();
		ArrayList<String> list = ut.parseData(value);
		
		for(String s: list)
		{
			muMap.put(s, new Mutex());
		}
		System.out.println();
		return visitChildren(ctx); 
	}
	
	@Override public Integer visitEndParallelStruct(LabeledExprParser.EndParallelStructContext ctx) 
	{ 
		for(Tasks t:critical)
			t.start();
		return visitChildren(ctx); 
	}
	
	
	public class Tasks extends Thread
	{
		private java.util.List<LabeledExprParser.StatContext> tree;
		private ArrayList<String> mutexList;
		private int uniqueInt;
		String taskName;
		List<LabeledExprParser.StatContext> st;
		
		Tasks(java.util.List<LabeledExprParser.StatContext> tree, ArrayList<String> mutexList, int uniqueInt, String taskName)
		{	
			this.tree = tree;
			this.mutexList = mutexList;
			this.uniqueInt = uniqueInt;
			this.taskName = taskName;
			st = treeMap.get(taskName);
		}
		
		public void run()
		{
			for(int count=0;count<10;count++)
			{
				for(String s: mutexList)
				{
					try {
						muMap.get(s).acquire();
						//System.out.println("acquired " + s +" by " + "pilosopher "+ uniqueInt);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}			
				}
				for(LabeledExprParser.StatContext stat: tree)
				{
					visit(stat);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(String s: mutexList)
				{
					muMap.get(s).release();
					//System.out.println("released " +s+" by " + "pilosopher "+ uniqueInt);
				}
				
				for(LabeledExprParser.StatContext s : st)
				{
					visit(s);
				}
				
				System.out.println(" ");	
			}
		}
	}
	
}

