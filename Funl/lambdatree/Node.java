package lambdatree;

public class Node {

    Node left;
    Node right;
    int value;

    public Node(int value) {
        this.left = null;
        this.right = null;
    }

    public IntNode getLeft() {
        return this.left;
    }

    public void setLeft(IntNode left) {
        this.left = left;
    }

    public IntNode getRight() {
        return this.right;
    }

    public void setRight(IntNode right) {
        this.right = right;
    }

    public void print() {

    }

}
