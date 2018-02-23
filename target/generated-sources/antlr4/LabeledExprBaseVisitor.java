// Generated from LabeledExpr.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class LabeledExprBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LabeledExprVisitor<T> {
	@Override public T visitPrintlnExpr(LabeledExprParser.PrintlnExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlank(LabeledExprParser.BlankContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintStrExpr(LabeledExprParser.PrintStrExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitInt(LabeledExprParser.IntContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddSub(LabeledExprParser.AddSubContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignStr(LabeledExprParser.AssignStrContext ctx) { return visitChildren(ctx); }

	@Override public T visitCndExpr(LabeledExprParser.CndExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitParens(LabeledExprParser.ParensContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulDiv(LabeledExprParser.MulDivContext ctx) { return visitChildren(ctx); }

	@Override public T visitId(LabeledExprParser.IdContext ctx) { return visitChildren(ctx); }

	@Override public T visitProg(LabeledExprParser.ProgContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintExpr(LabeledExprParser.PrintExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintlnStrExpr(LabeledExprParser.PrintlnStrExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitIfStat(LabeledExprParser.IfStatContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignInt(LabeledExprParser.AssignIntContext ctx) { return visitChildren(ctx); }
}