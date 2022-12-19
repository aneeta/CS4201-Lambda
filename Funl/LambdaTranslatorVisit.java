import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.TerminalNode;

import lambdatree.AbstractionNode;
import lambdatree.ApplicationNode;
import lambdatree.BinOpNode;
import lambdatree.ConditionalNode;
import lambdatree.ExpressionNode;
import lambdatree.LambdaTree;
import lambdatree.UnOpNode;
import lambdatree.VarNode;
import lambdatree.IntNode;

/**
 * Class to translate and evaluate Funl to Lambda Calculus.
 */
public class LambdaTranslatorVisit extends FunlBaseVisitor {

	private final List<String> arthmeticOperators = new ArrayList<>(
			Arrays.asList("+", "-", "/", "*", "<>", "<", ">", ">=", "<=", "=="));
	private final List<String> logicOperators = new ArrayList<>(
			Arrays.asList("and", "or"));

	private LambdaTree lambdaTree;
	private Map<String, ExpressionNode> abstractionsMap;

	private String currentFunction;
	private boolean currentFunctionRecursive;

	public LambdaTranslatorVisit() {
		this.lambdaTree = new LambdaTree();
		this.abstractionsMap = new HashMap<>();
	}

	public void printTree() {
		lambdaTree.print();
	}

	public void evaluate() {
		ExpressionNode root = lambdaTree.getRoot();
		System.out.println(root.toString());
		while (root.canReduce()) {
			root = root.reduce();
			System.out.println(root.toString());
		}
	}

	@Override
	public Void visitProgram(FunlParser.ProgramContext ctx) {
		for (FunlParser.DeclsContext dCtx : ctx.decls()) {
			visit(dCtx);
		}
		visit(ctx.main());

		return null;
	}

	@Override
	public Void visitMain(FunlParser.MainContext ctx) {
		currentFunction = "main";
		currentFunctionRecursive = false;

		if (ctx.where() != null) {
			visit(ctx.where());
		}

		ExpressionNode rootNode = (ExpressionNode) visit(ctx.expr());
		lambdaTree.setRoot(rootNode);
		return null;
	}

	@Override
	public Void visitDecls(FunlParser.DeclsContext ctx) {
		String id = ctx.IDENT().getText();
		String prevCurrentFunction = currentFunction;
		boolean prevCurrentFunctionRecursive = currentFunctionRecursive;
		currentFunction = id;
		currentFunctionRecursive = false;

		if (abstractionsMap.containsKey(id)) {

		}
		LambdaTree subTree = (LambdaTree) visit(ctx.args());
		ExpressionNode expr = (ExpressionNode) visit(ctx.expr());
		if (subTree.getRoot() == null) {
			// no args
			subTree.setRoot(expr);
			subTree.setCurrentNode(expr);
		} else {
			subTree.getCurrentNode().setRight(expr);
		}

		if (currentFunctionRecursive) {
			ExpressionNode yCombinatorApply = new ApplicationNode();
			yCombinatorApply.setLeft(lambdaTree.getYCombinatorNode());
			yCombinatorApply.setRight(new AbstractionNode());
			yCombinatorApply.getRight().setLeft(new VarNode("_f"));
			yCombinatorApply.getRight().setRight(subTree.getRoot());

			subTree.setRoot(yCombinatorApply);
		}

		abstractionsMap.put(id, subTree.getRoot());

		currentFunction = prevCurrentFunction;
		currentFunctionRecursive = prevCurrentFunctionRecursive;
		return null;
	}

	@Override
	public Void visitWhere(FunlParser.WhereContext ctx) {
		for (FunlParser.DeclsContext dCtx : ctx.decls()) {
			visit(dCtx);
		}
		return null;
	}

	@Override
	public LambdaTree visitArgs(FunlParser.ArgsContext ctx) {
		LambdaTree subTree = new LambdaTree();
		for (TerminalNode arg : ctx.IDENT()) {
			ExpressionNode node;
			// create right node
			if (subTree.getRoot() == null) {
				node = new AbstractionNode();
				subTree.setRoot(node);
				subTree.setCurrentNode(node);
			} else {
				node = subTree.getCurrentNode();
				AbstractionNode nextNode = new AbstractionNode();
				node.setRight(nextNode);
				subTree.setCurrentNode(nextNode);
				node = nextNode;
			}
			// create left node
			VarNode varNode = new VarNode(arg.getText());
			node.setLeft(varNode);
		}
		return subTree;
	}

	@Override
	public ApplicationNode visitApp(FunlParser.AppContext ctx) {
		ApplicationNode appNode = new ApplicationNode();

		ExpressionNode exprLeft = (ExpressionNode) visit(ctx.expr(0));
		ExpressionNode exprRight = (ExpressionNode) visit(ctx.expr(1));

		appNode.setLeft(exprLeft);
		appNode.setRight(exprRight);

		return appNode;
	}

	@Override
	public AbstractionNode visitNil(FunlParser.NilContext ctx) {
		// NIL = lambda f. true
		AbstractionNode node = new AbstractionNode();
		node.setLeft(new VarNode("f"));
		node.setRight(LambdaTree.getTrueNode());
		return node;
	}

	@Override
	public ExpressionNode visitUnOp(FunlParser.UnOpContext ctx) {
		String op = ctx.unop().getChild(0).toString();
		ExpressionNode node;
		if (op.equals("not")) {
			node = new ApplicationNode();
			node.setLeft(LambdaTree.getNotNode());
			node.setRight((ExpressionNode) visit(ctx.expr()));
			return node;
		}
		if (op.equals("-")) {
			node = new UnOpNode("-");
			node.setRight((ExpressionNode) visit(ctx.expr()));
			return node;
		}
		if (op.equals("hd")) {
			// TODO
			System.out.print("\nHEAD operator not supported!\n\n");
			System.exit(1);
		}
		if (op.equals("tl")) {
			// TODO
			System.out.print("\nTAIL operator not supported!\n\n");
			System.exit(1);
		}
		if (op.equals("null")) {
			// TODO
			System.out.print("\nNULL operator not supported!\n\n");
			System.exit(1);
		}
		return null;
	}

	@Override
	public ExpressionNode visitCond(FunlParser.CondContext ctx) {
		// predicate
		ExpressionNode predNode = (ExpressionNode) visit(ctx.expr(0));
		// then
		ExpressionNode thenNode = (ExpressionNode) visit(ctx.expr(1));
		// else
		ExpressionNode elseNode = (ExpressionNode) visit(ctx.expr(2));

		ApplicationNode node = new ApplicationNode();
		node.setLeft(new ApplicationNode());
		node.setRight(elseNode);

		node.getLeft().setLeft(new ApplicationNode());
		node.getLeft().setRight(thenNode);

		node.getLeft().getLeft().setLeft(LambdaTree.getIfNode());
		node.getLeft().getLeft().setRight(predNode);

		return node;
	}

	@Override
	public ExpressionNode visitBrackets(FunlParser.BracketsContext ctx) {
		return (ExpressionNode) visit(ctx.expr());
	}

	@Override
	public AbstractionNode visitTrue(FunlParser.TrueContext ctx) {
		return LambdaTree.getTrueNode();
	}

	@Override
	public ExpressionNode visitId(FunlParser.IdContext ctx) {
		String valName = ctx.getText();
		if (valName.equals(currentFunction)) {
			// recursion
			currentFunctionRecursive = true;
			return new VarNode("_f");
		}
		// if Identifier stands for a function, return the definition
		if (abstractionsMap.containsKey(valName)) {
			return abstractionsMap.get(valName);
		}
		// otherwise it's a variable
		VarNode varNode = new VarNode(valName);
		return varNode;
	}

	@Override
	public AbstractionNode visitFalse(FunlParser.FalseContext ctx) {
		return LambdaTree.getFalseNode();
	}

	@Override
	public ExpressionNode visitBinOp(FunlParser.BinOpContext ctx) {
		ExpressionNode node;

		String operator = ctx.binop().getText();
		if (arthmeticOperators.contains(operator)) {
			node = new BinOpNode(operator);

			ExpressionNode exprLeft = (ExpressionNode) visit(ctx.expr(0));
			ExpressionNode exprRight = (ExpressionNode) visit(ctx.expr(1));

			node.setLeft(exprLeft);
			node.setRight(exprRight);

		} else if (logicOperators.contains(operator)) {
			node = new ApplicationNode();
			// and/or
			node.setLeft(new ApplicationNode());
			node.getLeft().setLeft(LambdaTree.getAndNode());
			node.getLeft().setRight((ExpressionNode) visit(ctx.expr(0)));
			node.setRight((ExpressionNode) visit(ctx.expr(1)));
		} else {
			node = null;
			// TODO
			System.out.print("\nCONS operator not supported!\n\n");
			System.exit(1);
		}
		return node;
	}

	@Override
	public IntNode visitInt(FunlParser.IntContext ctx) {
		int intVal = Integer.parseInt(ctx.getText());
		IntNode intNode = new IntNode(intVal);
		return intNode;
	}
}
