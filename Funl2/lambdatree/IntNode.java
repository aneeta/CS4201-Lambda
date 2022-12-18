package lambdatree;

public class IntNode extends ExpressionNode {
    int value;

    public IntNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public void setLeft(ExpressionNode node) {
    }

    @Override
    public void setRight(ExpressionNode node) {
    }
}
