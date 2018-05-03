import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
	public ArrayList<String> parseData(String value)
	{
		ArrayList<String> list = new ArrayList<>(Arrays.asList(value.split(",")));
		return list;		
	}

}
