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

        // ExpressionNode before = this;
        // ExpressionNode current = left;
        // while (current instanceof ApplicationNode) {
        // before = current;
        // current = current.left;
        // }
        // AbstractionNode abs = (AbstractionNode) current;
        // VarNode var = (VarNode) abs.getLeft();

        // ExpressionNode replaced = abs.getRight().replace(var.getVar(), this.right);
        // if (before == this) {
        // return replaced;
        // }
        // before.setLeft(replaced);
        // return before;
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

    

    

    

    