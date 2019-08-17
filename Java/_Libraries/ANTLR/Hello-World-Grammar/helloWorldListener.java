// Generated from helloWorld.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloWorldParser}.
 */
public interface helloWorldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloWorldParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(helloWorldParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloWorldParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(helloWorldParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloWorldParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(helloWorldParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloWorldParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(helloWorldParser.ExprContext ctx);
}