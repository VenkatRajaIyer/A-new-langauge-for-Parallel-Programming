import java.util.ArrayList;
import java.util.Arrays;

import com.sun.tools.javac.util.List;


public class Utility {
	public ArrayList<String> parseData(String value)
	{
		ArrayList<String> list = new ArrayList<>(Arrays.asList(value.split(",")));
		return list;		
	}

}
