// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LabeledExprListener extends ParseTreeListener {
	void enterPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);
	void exitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);

	void enterBlank(LabeledExprParser.BlankContext ctx);
	void exitBlank(LabeledExprParser.BlankContext ctx);

	void enterPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);
	void exitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);

	void enterInt(LabeledExprParser.IntContext ctx);
	void exitInt(LabeledExprParser.IntContext ctx);

	void enterAddSub(LabeledExprParser.AddSubContext ctx);
	void exitAddSub(LabeledExprParser.AddSubContext ctx);

	void enterAssignStr(LabeledExprParser.AssignStrContext ctx);
	void exitAssignStr(LabeledExprParser.AssignStrContext ctx);

	void enterCndExpr(LabeledExprParser.CndExprContext ctx);
	void exitCndExpr(LabeledExprParser.CndExprContext ctx);

	void enterParens(LabeledExprParser.ParensContext ctx);
	void exitParens(LabeledExprParser.ParensContext ctx);

	void enterMulDiv(LabeledExprParser.MulDivContext ctx);
	void exitMulDiv(LabeledExprParser.MulDivContext ctx);

	void enterId(LabeledExprParser.IdContext ctx);
	void exitId(LabeledExprParser.IdContext ctx);

	void enterProg(LabeledExprParser.ProgContext ctx);
	void exitProg(LabeledExprParser.ProgContext ctx);

	void enterPrintExpr(LabeledExprParser.PrintExprContext ctx);
	void exitPrintExpr(LabeledExprParser.PrintExprContext ctx);

	void enterPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);
	void exitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);

	void enterIfStat(LabeledExprParser.IfStatContext ctx);
	void exitIfStat(LabeledExprParser.IfStatContext ctx);

	void enterAssignInt(LabeledExprParser.AssignIntContext ctx);
	void exitAssignInt(LabeledExprParser.AssignIntContext ctx);
}