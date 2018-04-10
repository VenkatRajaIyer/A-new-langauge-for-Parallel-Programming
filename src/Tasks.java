import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

public class Tasks extends Thread{
	List<ParseTree> pt = new ArrayList<ParseTree>();
	Tasks(ParseTree... tree)
	{
		for(ParseTree stat: tree)
		{
			pt.add(stat);
		}
	}
}
