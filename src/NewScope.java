import java.util.HashMap;


public class NewScope extends LabeledExprBaseVisitor<Integer> {
	HashMap<String, Integer> globalMemory;
	HashMap<String, Integer> scopeMemory = new HashMap<String, Integer>();
	public NewScope(HashMap<String, Integer> globalMemory) {
		this.globalMemory = globalMemory;
	}
	
	@Override
	public Integer visitAssignInt(LabeledExprParser.AssignIntContext ctx)
	{
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		scopeMemory.put(id, value);
		return value;
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
		if(scopeMemory.containsKey(id))
			return scopeMemory.get(id);
		else if (globalMemory.containsKey(id)) 
			return globalMemory.get(id);
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
	public Integer visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx)
	{
		int value = visit(ctx.expr());
		System.out.println(value);
		return 0;
	}
	
	@Override
	public Integer visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx)
	{		
		String value = ctx.STR().getText();
		System.out.print(value.substring(1,value.length()-1));
		return 0;
	}	
	
	@Override
	public Integer visitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx)
	{		
		String value = ctx.STR().getText();
		System.out.println(value.substring(1,value.length()-1));
		return 0;
	}
	
	@Override
	public Integer visitReturnfromfunction(LabeledExprParser.ReturnfromfunctionContext ctx)
	{
		//System.out.print(scopeMemory.get(ctx.ID().getText()));
		int returnVal = 0;
		if(scopeMemory.containsKey(ctx.ID().getText()))
		{
			returnVal = scopeMemory.get(ctx.ID().getText());
		}
		return returnVal;
	}
}
