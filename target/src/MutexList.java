import java.util.ArrayList;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;


public class MutexList {
	String taskName;
	ArrayList<Mutex> mL = new ArrayList<Mutex>();
	public MutexList(String taskName, ArrayList<Mutex> mL)
	{
		this.taskName = taskName;
		this.mL.addAll(mL);
	}
	
	public String getTaskName() {
		return taskName;
	}
	public ArrayList<Mutex> getmL() {
		return mL;
	}
	
	
}
