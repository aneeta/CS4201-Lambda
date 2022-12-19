package lambdatree;

public class AbstractionNode extends ExpressionNode {

    // public AbstractionNode() {
    // this.left = null;
    // this.right = null;
    // }

    // public AbstractionNode(VarNode left, ExpressionNode right) {
    // this.left = left;
    // this.right = right;
    // }

    public ExpressionNode getLeft() {
        return this.left;
    }

    public void setLeft(VarNode left) {
        this.left = left;
    }

    public ExpressionNode getRight() {
        return this.right;
    }

    public void setRight(ExpressionNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "λ" + left.toString() + ". " + right.toString();
    }

    @Override
    public boolean canReduce() {
        return right.canReduce();
    }

    public ExpressionNode reduce(ExpressionNode sub) {
        if (right.canReduce()) {
            right = right.reduce();
        }
        return this;
    }

    @Override
    public ExpressionNode replace(String var, ExpressionNode replacement) {
        VarNode leftVar = (VarNode) left;
        if (var.equals(leftVar.getVar())) {
            // do not replace when different var scope
            return this;
        }
        right = right.replace(var, replacement);
        return this;
    }

    @Override
    public ExpressionNode deepcopy() {
        AbstractionNode copy = new AbstractionNode();
        copy.left = this.left.deepcopy();
        copy.right = this.right.deepcopy();
        return copy;
    }

}

    

    