package lambdatree;

public class IntNode extends ExpressionNode {
    int value;

    public IntNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
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

    @Override
    public ExpressionNode replace(String var, ExpressionNode replacement) {
        return this;
    }

    @Override
    public ExpressionNode deepcopy() {
        return new IntNode(this.value);
    }
}
