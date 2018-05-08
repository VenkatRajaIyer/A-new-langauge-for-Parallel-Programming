import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;
/*
		 * capture the statements to be executed in a hashmap
		 * 
		 */
		/*
		 * Receive all the parameters of criticalSection and create mutex out of them 
		 */
public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
	
	HashMap<String, Integer> globalMemory = new HashMap<String, Integer>(); //ID : Value 
	HashMap<String, ArrayList<String>> taskMutexes = new HashMap<String, ArrayList<String>>();
	HashMap<String, Mutex> allMutexes = new HashMap<String, Mutex>();
	HashSet<Tasks> critical = new HashSet<Tasks>();
	
	/////New Hash Maps///////
	HashMap<String, Integer> mainMemory = new HashMap<String, Integer>(); ///same as memory
	HashMap<String, FunctionCreate> functionHM = new HashMap<String, FunctionCreate>();
	HashMap<String, TaskCreate> taskContents = new HashMap<String, TaskCreate>();
	
	boolean strType = false;
	private EvalVisitorString evalVisitorString = new EvalVisitorString();
	
	int count = 0;
	int countStat = 0;

	/*
	 * just create function
	 */
	@Override
	public Integer visitCreatefunction(LabeledExprParser.CreatefunctionContext ctx)
	{
		String function_name = ctx.ID().getText();
		FunctionCreate c = new FunctionCreate(ctx);
		functionHM.put(function_name, c);
		return 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see LabeledExprBaseVisitor#visitCall_function(LabeledExprParser.Call_functionContext)
	 * creates an object of time
	 */
	@Override
	public Integer visitCall_function(LabeledExprParser.Call_functionContext ctx)
	{
		HashMap<String, Integer> localMemory = new HashMap<String, Integer>();
		String ids = ctx.params().getText();
		Utility ut = new Utility();
		ArrayList<String> list = ut.parseData(ids);
		
		//copying necessary contents from globalMemory to localMemory
		for(String i: list)
			localMemory.put(i, globalMemory.get(i));
		
		FunctionCall fc= new FunctionCall(functionHM, localMemory);
		int returnedVal = fc.visitCall_function(ctx);
		return returnedVal;
	}
	
	/*
	 * (non-Javadoc)
	 * @see LabeledExprBaseVisitor#visitReturnfromfunction(LabeledExprParser.ReturnfromfunctionContext)
	 * Copies values from the function's HM and stores it into the caller's HM
	 */
	@Override
	public Integer visitReturnfromfunction(LabeledExprParser.ReturnfromfunctionContext ctx)
	{
		return 0;
	}
	
	@Override        ////main function/////
	public Integer visitWritemain(LabeledExprParser.WritemainContext ctx)
	{
		visitChildren(ctx);
//		for(Tasks t: critical)
//			t.start();
		return 0;
	}
	
	@Override
	public Integer visitAssignInt(LabeledExprParser.AssignIntContext ctx)
	{
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		globalMemory.put(id, value);
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
		//Try getting to know the parent
		if(globalMemory.containsKey(id)) return globalMemory.get(id);
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
		return 0;
	}
	
	@Override
	public Integer visitDelayfunction(LabeledExprParser.DelayfunctionContext ctx)
	{
		int a = Integer.valueOf(ctx.INT().getText());
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 1;
	}
	
	@Override 
	public Integer visitNewTask(LabeledExprParser.NewTaskContext ctx) 
	{ 
		String taskName = ctx.ID().getText();
		TaskCreate c = new TaskCreate(ctx);
		taskContents.put(taskName, c);
		
		String value = ctx.params().getText();
		Utility ut = new Utility();
		ArrayList<String> list = ut.parseData(value);
		ArrayList<String> mutexList = new ArrayList<String>(); 
		for(String s: list)
		{
			mutexList.add(s);
			if(!allMutexes.containsKey(s))
				allMutexes.put(s, new Mutex());
		}
		taskMutexes.put(taskName, mutexList);
		return 1;  
	}
	
	@Override 
	public Integer visitParallleloRuntime(LabeledExprParser.ParallleloRuntimeContext ctx) 
	{ 
		Utility ut = new Utility();
		ArrayList<String> tasks= ut.parseData(ctx.params().getText());
		for(String task: tasks)
		{
			TaskCreate taskObj = taskContents.get(task);
			critical.add(new Tasks(taskObj.getStat(), taskMutexes.get(task), task));
		}
		for(Tasks t: critical)
			t.start();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return 1; 
	}
	
	public class Tasks extends Thread
	{
			private ArrayList<String> mutexList;
			private String taskName;
			private List<LabeledExprParser.StatContext> st;
			private List<LabeledExprParser.CritaicalStatContext> cst;

			Tasks(java.util.List<LabeledExprParser.StatContext> tree, ArrayList<String> mutexList, String taskName)
			{	
				this.mutexList = mutexList;
				this.taskName = taskName;
				this.st = taskContents.get(taskName).getStat();
				this.cst = taskContents.get(taskName).getCriticalStat();
			}
			public void run()
			{
				st = taskContents.get(taskName).getStat();
				cst = taskContents.get(taskName).getCriticalStat();
				for(int count=0;count<10;count++)
				{
					for(String s: mutexList)
					{
						try {
							allMutexes.get(s).acquire();
							//System.out.println("acquired " + s +" by " + "pilosopher "+ uniqueInt);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}			
					}
					for(LabeledExprParser.CritaicalStatContext stat: cst)
					{
						visit(stat);
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					for(String s: mutexList)
					{
						allMutexes.get(s).release();
						//System.out.println("released " +s+" by " + "pilosopher "+ uniqueInt);
					}

					for(LabeledExprParser.StatContext s : st)
					{
						visit(s);
					}
				}
			}
	 }
}

