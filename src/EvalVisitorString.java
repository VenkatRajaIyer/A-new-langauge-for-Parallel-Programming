import java.util.HashMap;
import java.util.Map;
/**
 * class for strings manipulation
 * @author venkat
 *
 */
public class EvalVisitorString {
	Map<String, String> memoryStr = new HashMap<String, String>();

	public String visitAssignStr(String id, String string)
	{	
		string = sanitizeString(string);
		memoryStr.put(id, string);
		System.out.print(string);
		System.out.println("Added to the map");
		return string;
	}
	
	public String visitGetStr(String id)
	{	String string = "";
		if(memoryStr.containsKey(id))
		{
			string = memoryStr.get(id);
		}
		return string;
	}
	
	public String visitPrintStrExpr(String string)
	{	
		string = sanitizeString(string);
		System.out.print(string);
		return string;
	}
	
	public String visitPrintlnStrExpr(String string)
	{	
		string = sanitizeString(string);
		System.out.println(string);
		return string;
	}	
	
	private String sanitizeString(String string)
	{
		string = string.substring(1, string.length()-1);
		return string;
	}
}