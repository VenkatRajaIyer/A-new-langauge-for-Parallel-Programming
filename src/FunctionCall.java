import java.util.HashMap;
import java.util.List;



public class FunctionCall extends LabeledExprBaseVisitor<List<LabeledExprParser.StatContext>> {
	
	HashMap<String, FunctionCreate> functionHM = new HashMap<String, FunctionCreate>();
	HashMap<String, Integer> globalMemory = new HashMap<String, Integer>();

	public FunctionCall(HashMap<String, FunctionCreate> functionHM, HashMap<String, Integer> globalMemory) {
		// TODO Auto-generated constructor stub
		this.functionHM = functionHM;
		this.globalMemory = globalMemory;
	}
	@Override
	public List<LabeledExprParser.StatContext> visitCall_function(LabeledExprParser.Call_functionContext ctx)
	{
		if(functionHM.containsKey(ctx.ID().getText()))
		{
			List<LabeledExprParser.StatContext> stats = (functionHM.get(ctx.ID().getText())).getStat();
			NewScope functionScope = new NewScope(globalMemory);
			for (LabeledExprParser.StatContext statContext : stats) {
				functionScope.visit(statContext);
			}
		}	
		else
		{
				System.out.println("Not present in the function scope");
		}
		FunctionCreate fun =functionHM.get(ctx.ID().getText());
		return fun.getStat();
	}	

}
