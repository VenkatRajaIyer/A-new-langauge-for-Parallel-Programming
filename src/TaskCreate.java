import java.util.List;

public class TaskCreate {

		private String parametersType;
		private String ID;
		private List<LabeledExprParser.StatContext> stat;
		private List<LabeledExprParser.CritaicalStatContext> ctricalStat;
		
		public TaskCreate(LabeledExprParser.NewTaskContext ctx)
		{
			this.parametersType = ctx.params().getText();
			this.ID = ctx.ID().getText();
			this.stat = ctx.stat();
			this.ctricalStat = ctx.critaicalStat();
		}

		public String getParametersType() {
			return parametersType;
		}

		public String getID() {
			return ID;
		}
		
		public List<LabeledExprParser.StatContext> getStat() {
			return stat;
		}
		
		public List<LabeledExprParser.CritaicalStatContext> getCriticalStat() {
			return ctricalStat;
		}
		
}
