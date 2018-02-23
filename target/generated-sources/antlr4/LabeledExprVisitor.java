// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	T visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx);

	T visitBlank(LabeledExprParser.BlankContext ctx);

	T visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx);

	T visitInt(LabeledExprParser.IntContext ctx);

	T visitAddSub(LabeledExprParser.AddSubContext ctx);

	T visitAssignStr(LabeledExprParser.AssignStrContext ctx);

	T visitCndExpr(LabeledExprParser.CndExprContext ctx);

	T visitParens(LabeledExprParser.ParensContext ctx);

	T visitMulDiv(LabeledExprParser.MulDivContext ctx);

	T visitId(LabeledExprParser.IdContext ctx);

	T visitProg(LabeledExprParser.ProgContext ctx);

	T visitPrintExpr(LabeledExprParser.PrintExprContext ctx);

	T visitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx);

	T visitIfStat(LabeledExprParser.IfStatContext ctx);

	T visitAssignInt(LabeledExprParser.AssignIntContext ctx);
}