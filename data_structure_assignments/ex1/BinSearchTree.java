package data_structure_assignments.ex1;

public class BinSearchTree<T> {

    private BinNode<Integer> root;

    // c'tor for an empty tree
    public BinSearchTree() {
        root = null;
    }

    // a getter method to return the root of the tree
    public BinNode<Integer> getRoot() {
        return root;
    }

    // adding a new value/root to the tree
    public void add(int x) {
        if (root == null)    // if the tree is empty
            this.root = new BinNode<>(x);  // set as root with the x val.
        else  // the root isn't empty
            //    addIterative(x);  // add in an iterative manner
            addRecursive(root, x);
    }

    // adding a new value to the tree in an iterative manner
    private void addIterative(int x) {
        // we already at least the root of the tree (Ln18)
        BinNode<Integer> current = this.root;  // copy of the root

        // L2R
        // as long as x is smaller than the root, and we have left child
        while ((x < current.getValue() && current.hasLeft())
                || x >= current.getValue() && current.hasRight()) {
            // we iterate down
            if (x < current.getValue())
                current = current.getLeft();   // going left
            else
                current = current.getRight();  // going right
        }  // end of while

        BinNode<Integer> node = new BinNode<>(x);  // creating new node

        if (x < current.getValue())  // if value is smaller than curr.
            current.setLeft(node);  // inserting the new node as left child
        else                        // if the val. is >= curr.
            current.setRight(node); // inserting the new node as right child
    }

    // adding a new value to the tree in a recursive manner
    private void addRecursive(BinNode<Integer> current, int x) {
        if (x < current.getValue()) {  // x < curr
            if (!current.hasLeft())   // if there isn't a left child
                current.setLeft(new BinNode<>(x));
            else
                addRecursive(current.getLeft(), x);
        } else {   // x is bigger than current.getValue()
            if (!current.hasRight())  // if there isn't a right child
                current.setRight(new BinNode<>(x));
            else                    // you have a child...
                addRecursive(current.getRight(), x);
        }
    }
}