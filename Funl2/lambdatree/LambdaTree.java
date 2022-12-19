package lambdatree;

public class LambdaTree {

    private ExpressionNode root;
    private ExpressionNode prevNode;
    private ExpressionNode currentNode;

    public LambdaTree() {
        this.root = null;
        this.prevNode = null;
        this.currentNode = null;
    }

    public void defineFunction(String funcName, AbstractionNode rootNode) {

    }

    // public VarNode getFuncNode(String funcName, ExpressionNode seachNode) {
    // if (seachNode instanceof VarNode) {
    // if (seachNode.getVar().equals(funcName)) {
    // return
    // }
    // }
    // }

    public void reduce(ExpressionNode node) {
        // ExpressionNode newRoot;

        // while (node.getLeft() == null || node.getRight() == null) {
        // // we're at int or var node (leaf) -> cant reduce
        // return;
        // }
        // if (node.getLeft() instanceof AbstractionNode) {
        // ExpressionNode sub = node.getRight();
        // AbstractionNode toSub = (AbstractionNode) node.getLeft();
        // VarNode varToSub = (VarNode) toSub.getLeft();
        // subVars(varToSub, sub, toSub.getRight());
        // } else {
        // reduce(node.getLeft());
        // reduce(node.getRight());
        // }
        // // if (root instanceof ApplicationNode) {
        // // ubstitute var from varNode with expression

        // // essionNode toSub = root.getLeft();
        // // ssume left is an abstraction
        // // ode varToSub = (VarNode) toSub.getLeft();
        // // ars(varToSub, sub, toSub.getRight());
        // // = toSub;
        // // }
        node.toString();
        return;
    }

    public void subVars(VarNode var, ExpressionNode sub, ExpressionNode currentNode) {
        if (currentNode.getLeft().getLeft() != null) {

            if (currentNode.getLeft() instanceof VarNode) {
                VarNode v = (VarNode) currentNode.getLeft();
                if (v.getVar().equals(var.getVar())) {
                    currentNode.setLeft(sub);
                }
            } else {
                subVars(var, sub, currentNode.getLeft());
            }
        }
        if (currentNode.getRight().getRight() != null) {
            if (currentNode.getRight() instanceof VarNode) {
                VarNode v = (VarNode) currentNode.getRight();
                if (v.getVar().equals(var.getVar())) {
                    currentNode.setRight(sub);
                }
            } else {
                subVars(var, sub, currentNode.getRight());
            }
        }
        return;

    }

    public ExpressionNode getRoot() {
        return this.root;
    }

    public void setRoot(ExpressionNode root) {
        this.root = root;
    }

    public ExpressionNode getParent(ExpressionNode node) {
        // TODO improve, hella clunky
        // while()
        // if (node == null) {
        // return null;
        // }
        // if ()

    }

    public ExpressionNode getCurrentNode() {
        return this.currentNode;
    }

    public void setCurrentNode(ExpressionNode currentNode) {
        this.currentNode = currentNode;
    }

    public void print() {
        // TODO
        System.out.println(root.toString());
    }

    public void add(ExpressionNode node) {
        // adding to current node
        // add to left and if full then add to right
        if (currentNode.left == null) {
            currentNode.setLeft(node);
        } else if (currentNode.right == null) {
            currentNode.setRight(node);
        } else {
            // throw new Exception("Node full!");
            System.out.println("Node full!");
        }
    }

    public ExpressionNode getPrevNode() {
        return this.prevNode;
    }

    public void setPrevNode(ExpressionNode prevNode) {
        this.prevNode = prevNode;
    }
}
