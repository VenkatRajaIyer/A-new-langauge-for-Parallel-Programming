import java.io.IOException;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;


public class Calc {
	
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		LabeledExprLexer lexer = new LabeledExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LabeledExprParser parser = new LabeledExprParser(tokens);
		ParseTree tree = parser.prog();
		EvalVisitor eval = new EvalVisitor();
		eval.visit(tree);		
		}
}
