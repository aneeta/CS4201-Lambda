package lambdatree;

public class UnOpNode extends ExpressionNode {
    String operator;

    public UnOpNode(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        String space = (operator.equals("-")) ? "" : " ";
        return "(" + operator + space + ")" + right.toString();
    }

    @Override
    public boolean canReduce() {
        if (right instanceof IntNode) {
            return true;
        }
        return right.canReduce();
    }

    @Override
    public ExpressionNode reduce() {
        if (right instanceof IntNode) {
            IntNode node = (IntNode) right;
            return new IntNode(-node.getValue());
        }

        if (right.canReduce()) {
            right = right.reduce();
        }
        return this;
    }

    @Override
    public void setLeft() {
    }

    @Override
    public ExpressionNode deepcopy() {
        UnOpNode copy = new UnOpNode(this.operator);
        copy.right = this.right.deepcopy();
        return copy;
    }

}
