// Generated from /Users/brittniwatkins/Desktop/CSE-3342/Assignment_12b/src/HelloWorld.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloWorldParser}.
 */
public interface HelloWorldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(HelloWorldParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(HelloWorldParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloWorldParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloWorldParser.ExprContext ctx);
}