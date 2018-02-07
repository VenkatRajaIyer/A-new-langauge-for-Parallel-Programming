import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
	
	Map<String, Integer> memory = new HashMap<String, Integer>();

	@Override
	public Integer visitAssign(LabeledExprParser.AssignContext ctx)
	{
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		memory.put(id, value);
		return value;
	}
	
	@Override
	public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx)
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
	
}

