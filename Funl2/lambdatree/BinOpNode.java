package lambdatree;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class BinOpNode extends ExpressionNode {
    String operator;

    // private final ScriptEngine engine = new
    // ScriptEngineManager().getEngineByName("js");

    public BinOpNode(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " " + operator + " " + right.toString() + ")";
    }

    @Override
    public boolean canReduce() {
        if (left instanceof IntNode && right instanceof IntNode) {
            return true;
        }
        return left.canReduce() || right.canReduce();
    }

    @Override
    public ExpressionNode reduce() {
        if (left.canReduce()) {
            left = left.reduce();
        } else if (right.canReduce()) {
            right = right.reduce();
        } else {
            if (left instanceof IntNode && right instanceof IntNode) {
                IntNode leftInt = (IntNode) left;
                IntNode rightInt = (IntNode) right;
                int result;
                switch (operator) {
                    // TODO: rest of ops
                    case "+":
                        result = leftInt.getValue() + rightInt.getValue();
                        break;
                    case "-":
                        result = leftInt.getValue() - rightInt.getValue();
                        break;
                    case "/":
                        result = leftInt.getValue() / rightInt.getValue();
                        break;
                    case "*":
                        result = leftInt.getValue() * rightInt.getValue();
                        break;
                    case "<>":
                        if (leftInt.getValue() != rightInt.getValue()) {
                            return LambdaTree.getTrueNode();
                        } else {
                            return LambdaTree.getFalseNode();
                        }
                    case ">":
                        if (leftInt.getValue() > rightInt.getValue()) {
                            return LambdaTree.getTrueNode();
                        } else {
                            return LambdaTree.getFalseNode();
                        }
                    case ">=":
                        if (leftInt.getValue() >= rightInt.getValue()) {
                            return LambdaTree.getTrueNode();
                        } else {
                            return LambdaTree.getFalseNode();
                        }
                    case "<":
                        if (leftInt.getValue() < rightInt.getValue()) {
                            return LambdaTree.getTrueNode();
                        } else {
                            return LambdaTree.getFalseNode();
                        }
                    case "<=":
                        if (leftInt.getValue() <= rightInt.getValue()) {
                            return LambdaTree.getTrueNode();
                        } else {
                            return LambdaTree.getFalseNode();
                        }
                    default:
                        result = 0;
                        break;
                }
                return new IntNode(result);
            }
        }
        return this;
    }

    @Override
    public ExpressionNode replace(String var, ExpressionNode replacement) {
        left = left.replace(var, replacement);
        right = right.replace(var, replacement);
        return this;
    }

    @Override
    public ExpressionNode deepcopy() {
        BinOpNode copy = new BinOpNode(this.operator);
        copy.left = this.left.deepcopy();
        copy.right = this.right.deepcopy();
        return copy;
    }
}
