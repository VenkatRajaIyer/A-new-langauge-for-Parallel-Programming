import java.util.HashMap;
import java.util.Map;
/**
 * class for strings manipulation
 * @author venkat
 *
 */
public class EvalVisitorString {
	Map<String, String> memoryStr = new HashMap<String, String>();

	public String visitAssignStr(String string)
	{		
		return string;
	}
	
	public String visitPrintStrExpr(String string)
	{	
		string = string.substring(1, string.length()-1);
		System.out.print(string);
		return string;
	}
	
	public String visitPrintlnStrExpr(String string)
	{	
		string = string.substring(1, string.length()-1);
		System.out.println(string);
		return string;
	}
}