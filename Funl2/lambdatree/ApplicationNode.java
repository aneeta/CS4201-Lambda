package lambdatree;

public class ApplicationNode extends ExpressionNode {

    @Override
    public String toString() {
        return "(" + left.toString() + ") " + right.toString();
    }

    @Override
    public boolean canReduce() {
        if (this.left instanceof AbstractionNode) {
            return true;
        }
        return left.canReduce() || right.canReduce();
    }

    @Override
    public ExpressionNode reduce() {
        if (this.left instanceof AbstractionNode) {
            AbstractionNode abs = (AbstractionNode) this.left;
            VarNode var = (VarNode) abs.getLeft();
            return abs.getRight().replace(var.getVar(), this.right);
        } else if (left.canReduce()) {
            this.left = this.left.reduce();
        } else if (right.canReduce()) {
            this.right = this.right.reduce();
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
        ApplicationNode copy = new ApplicationNode();
        copy.left = this.left.deepcopy();
        copy.right = this.right.deepcopy();
        return copy;
    }

}

    

    

        

    