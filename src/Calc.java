import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;


public class Calc {
	public static void main(String[] args) throws IOException {
		String inputFile = null;
		if(args.length>0) {
			inputFile = args[0];
		}
		InputStream is = System.in;
		if(inputFile!=null){
			is = new FileInputStream(inputFile);
		}
		
	ANTLRInputStream input = new ANTLRInputStream(is);
	LabeledExprLexer lexer = new LabeledExprLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	LabeledExprParser parser = new LabeledExprParser(tokens);
	ParseTree tree = parser.prog();
//	EvalVisitor eval = new EvalVisitor();
//	eval.visit(tree);	
	TesterClass t = new TesterClass();
	t.visit(tree);
	}
}
