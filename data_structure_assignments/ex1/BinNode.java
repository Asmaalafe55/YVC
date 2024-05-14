package data_structure_assignments.ex1;

// What it means to be Binary Node
public class BinNode<T> {

    private BinNode<T> left;
    private BinNode<T> right;
    private T value;

    // constructor for a node w/ children
    public BinNode(BinNode<T> left, T value, BinNode<T> right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

    // constructor for a leaf node
    public BinNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    // hasLeft(): return true if the node a left child
    public boolean hasLeft() {
        return this.left != null;
    }

    // getLeft(): return the left child
    public BinNode<T> getLeft() {
        return left;
    }

    // setLeft(): create a new left child
    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    // getValue(): return the value of the node (the key)
    public T getValue() {
        return value;
    }

    // setValue(): update the value of the node
    public void setValue(T value) {
        this.value = value;
    }

    // hasRight(): return true if the node has a right child
    public boolean hasRight() {
        return this.right != null;
    }

    // getRight(): return the right child
    public BinNode<T> getRight() {
        return right;
    }

    // setRight(): create a new right child
    public void setRight(BinNode<T> right) {
        this.right = right;
    }

}