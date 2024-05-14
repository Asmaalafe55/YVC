package data_structure_assignments.ex2;

// AVL Node
public class BinNode <T> {
    private BinNode<T> left;
    private T value;
    private int height;
    private BinNode<T> right;

    // C'tor w/ 3 params. for creating a node w/ 2 children.
    public BinNode(BinNode<T> left, T value, BinNode<T> right) {
        this.left = left;
        this.setValue(value);
        this.right = right;
        this.height = 0;
    }
    
    // Constructor for creating a leaf node (no children)
    public BinNode(T value) {
        this.setValue(value);
        this.right = null;
        this.left = null;
        this.height = 0;
    }
    
    // returns the node's height value
    public int getHeight() {
        return height;
    }

    // updates the node's height value
    public void setHeight(int height) {
        this.height = height;
    }

    // returns true if the node has a left child   
    public boolean hasLeft() {
        return this.left != null;
    }
    
    // returns the left child
    public BinNode<T> getLeft() {
        return left;
    }
    
    // creates a new left child
    public void setLeft(BinNode<T> left) {
        this.left = left;
    }
    
    // returns true if the node has a right child   
    public boolean hasRight() {
        return this.right != null;
    }
    
    // returns the right child
    public BinNode<T> getRight() {
        return right;
    }
    
    // creates a new right child
    public void setRight(BinNode<T> right) {
        this.right = right;
    }
    
    // return the data stored in the node
    public T getValue() {
        return value;
    }
    
    // updates the data in the node
    public void setValue(T value) {
        this.value = value;
    }
    
}