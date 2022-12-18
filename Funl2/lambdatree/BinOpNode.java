package lambdatree;

public class BinOpNode extends ExpressionNode {
    String operator;

    public BinOpNode(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return left.toString() + " " + operator + " " + right.toString();
    }

}
