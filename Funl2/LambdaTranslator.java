import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import lambdatree.AbstractionNode;
import lambdatree.ApplicationNode;
import lambdatree.BinOpNode;
import lambdatree.ExpressionNode;
import lambdatree.IntNode;
import lambdatree.LambdaTree;
import lambdatree.VarNode;

public class LambdaTranslator extends FunlBaseListener {

	FunlParser parser;
	LambdaTree lambdaTree;
	Map<String, ExpressionNode> abstractionsMap;

	public LambdaTranslator(FunlParser parser) {
		this.parser = parser;
		this.lambdaTree = new LambdaTree();
		this.abstractionsMap = new HashMap<>();
	}

	@Override
	public void exitProgram(FunlParser.ProgramContext ctx) {
		// subsitute the function declaration subtrees into the lambda tree

		// print the translation
		lambdaTree.print();
	}

	@Override
	public void enterMain(FunlParser.MainContext ctx) {
		// will have an expression
		// might have a where clause
	}

	@Override
	public void exitMain(FunlParser.MainContext ctx) {
	}

	@Override
	public void enterDecls(FunlParser.DeclsContext ctx) {
		// make function
		String id = ctx.IDENT().getText();
		AbstractionNode absNode = new AbstractionNode();
		lambdaTree.setCurrentNode(absNode);
		abstractionsMap.put(id, absNode);
	}

	@Override
	public void exitDecls(FunlParser.DeclsContext ctx) {
	}

	@Override
	public void enterWhere(FunlParser.WhereContext ctx) {
	}

	@Override
	public void exitWhere(FunlParser.WhereContext ctx) {
	}

	@Override
	public void enterArgs(FunlParser.ArgsContext ctx) {
		// if a function has only one arg, then it can
		// be represented directly by the AbstactionNode
		// else the expression will contan next abstraction node

		String varName = ctx.getChild(0).toString();
		lambdaTree.add(new VarNode(varName));

		// if multiple args, branch down
		for (int i = 1; i < ctx.children.size(); i++) {
			// make a new node
			AbstractionNode nextNode = new AbstractionNode();
			lambdaTree.add(nextNode);
			nextNode.setParent(lambdaTree.getCurrentNode());
			lambdaTree.setCurrentNode(nextNode);
			String nextVarName = ctx.getChild(i).toString();
			lambdaTree.add(new VarNode(nextVarName));
		}

	}

	@Override
	public void exitArgs(FunlParser.ArgsContext ctx) {
	}

	@Override
	public void enterApp(FunlParser.AppContext ctx) {
		ApplicationNode appNode = new ApplicationNode();

		if (lambdaTree.getRoot() == null) {
			lambdaTree.setRoot(appNode);
		} else {
			appNode.setParent(lambdaTree.getCurrentNode());
			// adding to current (parent) node
			lambdaTree.add(appNode);
		}
		// setting this node as current in case we descend
		lambdaTree.setCurrentNode(appNode);
	}

	@Override
	public void exitApp(FunlParser.AppContext ctx) {
		// set current node to parent node
		lambdaTree.setCurrentNode(lambdaTree.getCurrentNode().getParent());
	}

	@Override
	public void enterNil(FunlParser.NilContext ctx) {
	}

	@Override
	public void exitNil(FunlParser.NilContext ctx) {
	}

	@Override
	public void enterUnOp(FunlParser.UnOpContext ctx) {
	}

	@Override
	public void exitUnOp(FunlParser.UnOpContext ctx) {
	}

	@Override
	public void enterCond(FunlParser.CondContext ctx) {
	}

	@Override
	public void exitCond(FunlParser.CondContext ctx) {
	}

	@Override
	public void enterBrackets(FunlParser.BracketsContext ctx) {
	}

	@Override
	public void exitBrackets(FunlParser.BracketsContext ctx) {
	}

	@Override
	public void enterTrue(FunlParser.TrueContext ctx) {
	}

	@Override
	public void exitTrue(FunlParser.TrueContext ctx) {
	}

	@Override
	public void enterId(FunlParser.IdContext ctx) {
		String varName = ctx.getText();
		VarNode varNode = new VarNode(varName);
		lambdaTree.add(varNode);
	}

	@Override
	public void exitId(FunlParser.IdContext ctx) {
	}

	@Override
	public void enterFalse(FunlParser.FalseContext ctx) {
	}

	@Override
	public void exitFalse(FunlParser.FalseContext ctx) {
	}

	@Override
	public void enterBinOp(FunlParser.BinOpContext ctx) {
		String operator = ctx.binop().getText();
		BinOpNode binOpNode = new BinOpNode(operator);

		if (lambdaTree.getRoot() == null) {
			lambdaTree.setRoot(binOpNode);
		} else {
			binOpNode.setParent(lambdaTree.getCurrentNode());
			// adding to current (parent) node
			lambdaTree.add(binOpNode);
		}
		lambdaTree.setCurrentNode(binOpNode);
	}

	@Override
	public void exitBinOp(FunlParser.BinOpContext ctx) {
		lambdaTree.setCurrentNode(lambdaTree.getCurrentNode().getParent());
	}

	@Override
	public void enterInt(FunlParser.IntContext ctx) {
		int intVal = Integer.parseInt(ctx.getText());
		IntNode intNode = new IntNode(intVal);
		lambdaTree.add(intNode);
	}

	@Override
	public void exitInt(FunlParser.IntContext ctx) {
	}

	@Override
	public void enterUnop(FunlParser.UnopContext ctx) {
	}

	@Override
	public void exitUnop(FunlParser.UnopContext ctx) {
	}

	@Override
	public void enterBinop(FunlParser.BinopContext ctx) {
	}

	@Override
	public void exitBinop(FunlParser.BinopContext ctx) {
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void visitTerminal(TerminalNode node) {
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
	}
}
