package lambdatree;

public class VarNode extends ExpressionNode {
    String individualVar;

    public VarNode(String individualVar) {
        this.individualVar = individualVar;
    }

    @Override
    public String toString() {
        return individualVar;
    }

    @Override
    public void setLeft(ExpressionNode node) {
    }

@Override
    public void setRight(ExpressionNode node) {
    }
}
