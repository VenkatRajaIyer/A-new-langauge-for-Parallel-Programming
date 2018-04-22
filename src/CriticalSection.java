import java.util.ArrayList;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;

public class CriticalSection extends LabeledExprBaseVisitor<MutexList>{
	
	String taskName;
	ArrayList<Mutex> mutexList = new ArrayList<Mutex>(); 
	public CriticalSection(String taskName)
	{
		this.taskName = taskName;
	}
	
	@Override
	public MutexList visitNewTask(LabeledExprParser.NewTaskContext ctx)
	{		
		String value = ctx.params().getText();
		Utility ut = new Utility();
		ArrayList<String> list = ut.parseData(value);
		
		for(String s: list)
		{
			mutexList.add(new Mutex());
		}
		return new MutexList(taskName, mutexList);
	}
}
