// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunlParser}.
 */
public interface FunlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunlParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunlParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(FunlParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(FunlParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(FunlParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(FunlParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(FunlParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(FunlParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code App}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterApp(FunlParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code App}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitApp(FunlParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nil}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNil(FunlParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nil}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNil(FunlParser.NilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnOp}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnOp(FunlParser.UnOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnOp}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnOp(FunlParser.UnOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCond(FunlParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCond(FunlParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(FunlParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(FunlParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code True}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(FunlParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code True}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(FunlParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(FunlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(FunlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code False}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(FunlParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code False}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(FunlParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(FunlParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(FunlParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(FunlParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(FunlParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#unop}.
	 * @param ctx the parse tree
	 */
	void enterUnop(FunlParser.UnopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#unop}.
	 * @param ctx the parse tree
	 */
	void exitUnop(FunlParser.UnopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(FunlParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(FunlParser.BinopContext ctx);
}