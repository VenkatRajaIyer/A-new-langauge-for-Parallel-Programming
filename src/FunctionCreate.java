import java.util.List;


public class FunctionCreate {
	private String parametersType;
	private String ID;
	private String fparams;
	private List<LabeledExprParser.StatContext> stat;
	//private LabeledExprParser.ReturnstatementContext returnstatement;
	
	public FunctionCreate(LabeledExprParser.CreatefunctionContext ctx)
	{
		this.parametersType = ctx.parametersType().getText();
		this.ID = ctx.ID().getText();
		this.fparams = ctx.fparams().getText();
		this.stat = ctx.stat();
		//this.returnstatement = ctx.returnstatement();
	}

	public String getParametersType() {
		return parametersType;
	}

	public String getID() {
		return ID;
	}

	public String getFparams() {
		return fparams;
	}

	public List<LabeledExprParser.StatContext> getStat() {
		return stat;
	}

	//public LabeledExprParser.ReturnstatementContext getReturnstatement() {
	//	return returnstatement;
	//}
	
}
