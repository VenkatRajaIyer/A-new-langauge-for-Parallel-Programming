import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
	
	Map<String, Integer> memory = new HashMap<String, Integer>();
	Map<String, String> memoryStr = new HashMap<String, String>();
	Map<String, Integer> dataType = new HashMap<String, Integer>();
	
	private final int INTEGERTYPE = 0;
	private final int STRINGTYPE = 1;
	boolean strType = false;
	private EvalVisitorString evalVisitorString = new EvalVisitorString();

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
		System.out.print("this is the print expr "+visit(ctx.expr()));
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
	public Integer visitNewParallelStruct(LabeledExprParser.NewParallelStructContext ctx) 
	{ 
		return visitChildren(ctx); 
	}
}

