import java.util.HashMap;
import java.util.List;



public class FunctionCall extends LabeledExprBaseVisitor<Integer> {
	
	HashMap<String, FunctionCreate> functionHM = new HashMap<String, FunctionCreate>();
	HashMap<String, Integer> localMemory = new HashMap<String, Integer>();

	public FunctionCall(HashMap<String, FunctionCreate> functionHM, HashMap<String, Integer> localMemory) {
		// TODO Auto-generated constructor stub
		this.functionHM = functionHM;
		this.localMemory = localMemory;
	}
	/*
	 * (non-Javadoc)
	 * @see LabeledExprBaseVisitor#visitCall_function(LabeledExprParser.Call_functionContext)
	 * @params the current context, i.e., the function call statement
	 * 
	 */
	@Override
	public Integer visitCall_function(LabeledExprParser.Call_functionContext ctx)
	{
		int returnValue = 0;
		if(functionHM.containsKey(ctx.function_id().getText()))
		{
			List<LabeledExprParser.StatContext> stats = functionHM.get(ctx.function_id().getText()).getStat();
			NewScope functionScope = new NewScope(localMemory);
			for (LabeledExprParser.StatContext statContext : stats) {
				returnValue = functionScope.visit(statContext);
			}
		}	
		else
		{
				System.out.println("Not present in the function scope");
		}
		return returnValue;
	}	

}
