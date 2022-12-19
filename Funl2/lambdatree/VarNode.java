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

    public String getVar() {
        return individualVar;
    }

    @Override
    public void setLeft(ExpressionNode node) {
    }

    @Override
    public void setRight(ExpressionNode node) {
    }

    @Override
    public ExpressionNode replace(String var, ExpressionNode replacement) {
        if (!var.equals(this.individualVar)) {
            return this;
        }
        return replacement.deepcopy();
    }

    @Override
    public ExpressionNode deepcopy() {
        return new VarNode(this.individualVar);
    }
}
