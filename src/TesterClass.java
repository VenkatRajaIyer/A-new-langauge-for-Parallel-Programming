
public class TesterClass extends LabeledExprBaseVisitor<Integer>{
	@Override
	public Integer visitCall_function(LabeledExprParser.Call_functionContext ctx)
	{
		System.out.println("Outer");
		Test t = new Test();
		t.visit(ctx);
		return 1;
	}
	
	@Override 
	public Integer visitNewTask(LabeledExprParser.NewTaskContext ctx) 
	{ 
		System.out.println("VisitNew TASK");
		/*
		 * TODO - This is it.. the apocalypse
		 */
		//visit(ctx.stat(1));
		return 1;  
	}
	
	private class Test extends LabeledExprBaseVisitor<Integer>
	{
		@Override
		public Integer visitCall_function(LabeledExprParser.Call_functionContext ctx)
		{
			System.out.println("test");
			return 1;
		}
		
		@Override 
		public Integer visitNewTask(LabeledExprParser.NewTaskContext ctx) 
		{ 
			System.out.println("VisitNew TASK");
			/*
			 * TODO - This is it.. the apocalypse
			 */
			//visit(ctx.stat(1));
			return 1;  
		}
		
		
	}
 
}
