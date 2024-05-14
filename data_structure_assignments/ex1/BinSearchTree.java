package data_structure_assignments.ex1;

public class BinSearchTree<T> {

    private BinNode<Integer> root;

    // constructor for an empty tree
    public BinSearchTree() {
        root = null;
    }

    // a getter method to return the root of the tree
    public BinNode<Integer> getRoot() {
        return root;
    }

    // Adding a new value/root to the tree
    public void add(int x) {
        if (root == null)                         // if the tree is empty
            this.root = new BinNode<Integer>(x);  // set as root with the x value
        else { // the root isn't empty
            addIterative(x); // add in an iterative manner
            // or: addRecrursive(this.root, x);
        }
    }

    // Adding a new value to the tree in an iterative manner
    private void addIterative (int x) {
        // We already have at least the root of the tree from Ln18
        BinNode<Integer> current = this.root;                          // a copy of the root node
        // as long as x is smaller than the root, and we have a left node, or, x >= current, and we have a right child
        while ( (x < current.getValue() && current.hasLeft() ) ||  (x >= current.getValue() && current.hasRight()) ) {  // we iterate down
            if (x < current.getValue()) current = current.getLeft();   // going left
            else current = current.getRight();                         // going right
        }  // End of while
        
        BinNode<Integer> node = new BinNode<>(x);  // creating the new node with val. x

        if (x < current.getValue()) // if its value is smaller than the current
            current.setLeft(node);  // inserting the new node as a left child
        else                        // else, if its value is larger than the current
            current.setRight(node); // inserting the new node as a right child
    }
    
    // Adding a new value to the tree in recursive manner
    private void addRecursive(BinNode<Integer> current, int x) {
        if (x < current.getValue()) {                      // our value (x) is smaller than the current value
            if (!current.hasLeft())                        // if there isn't a left child
                current.setLeft(new BinNode<>(x));         // add it as a left child
            else
                addRecursive(current.getLeft(),x);        // continue searching on the left side
        }
        else {                                             // x is larger than the current.getValue()
            if (!current.hasRight())                       // if there isn't a right child
                current.setRight(new BinNode<>(x));        // add it as a right child
            else
                addRecursive(current.getRight(),x);       // continue the search on the right side
        }
    }

    // printing the tree values, in-order
    public void printInOrder() {
        callInOrder(this.root);
    }
    private void callInOrder(BinNode<Integer> current) {  // the parameter is the root node (from Ln84)
        if (current != null) {                            // if there's a node
            callInOrder(current.getLeft());               // recursive call to the left side
            System.out.print(current.getValue() + ", ");  // print the current val.
            callInOrder(current.getRight());              // recursive call to the right side
        }
    }

    // printing the tree values, pre-order
    public void preOrder() {
        callPreOrder(this.root);
    }
    private void callPreOrder(BinNode<Integer> current) {
        if (current != null) {
            System.out.print(current.getValue() + ", ");  // first, we print the curr. val.
            callPreOrder(current.getLeft());              // recursive call to the left side
            callPreOrder(current.getRight());             // recursive call to the right side
        }
    }

    // printing the tree values, post-order
    public void postOrder() {
        callPostOrder(this.root);
    }
    // we'll see leaf values first, then roots
    private void callPostOrder(BinNode<Integer> current) {
        if (current != null) {
            callPostOrder(current.getLeft());             // recursive call to the left side
            callPostOrder(current.getRight());            // recursive call to the right side
            System.out.print(current.getValue() + ", ");  // print the curr. val.
        }
    }
    
    // tell me if x exists in the tree
    public boolean exists(int x) {
        return existsIterative(x);
        // or: return existsRcsv(this.root, x);
    }

    // Tell me if x exists in the tree (iterative)
    private boolean existsIterative(int x) {
        BinNode<Integer> current = this.root;
        while (current != null) {
            if (current.getValue() == x)
                return true;
            if (x < current.getValue())
                current = current.getLeft();
            else
                current = current.getRight();
        }
        return false;  // x was not found
    }

    // tell me if x exists in the tree (recursive)
    private boolean existsRecursive(BinNode<Integer> current, int x) {
        if (current == null)                       // if the tree is empty,
            return false;                          // then return false.
        if (current.getValue() == x)               // if the curr. value is x,
            return true;                           // then return true.
        if (x < current.getValue())                // if x is smaller, then check in the left subtree
            return existsRecursive(current.getLeft(), x);
        return existsRecursive(current.getRight(),x);  // else, search the right subtree
    }
    
    // find x (value) in the tree and return it
    public Integer getNode(int x) {
        return getNode(this.root, x);
    }
    // retrieving the value after searching for it
    private Integer getNode(BinNode<Integer> current, int x) {
        if (current == null)
            return null;
        if (current.getValue() == x)
            return x;

        if (x < current.getValue())
            return getNode(current.getLeft(), x);   // left subtree
        else
            return getNode(current.getRight(), x);  // right subtree
    }
    
    // finding the node with the maximum value
    public int biggest() throws Exception {
        if (root == null)
            throw new Exception("The tree is empty");
        return biggest(this.root).getValue();
    }
    private BinNode<Integer> biggest(BinNode<Integer> current) {
        if (!current.hasRight())  // if there are no right children,
            return current;          // then you (curr.) are the biggest
        return biggest(current.getRight());  // more children? go right...
    }

    // finding the node with the minimum value
    public int smallest() throws Exception {
        if (root == null)
            throw new Exception("The tree is empty");
        return smallest(this.root).getValue();
    }
    // smallest -- iterative version
    private BinNode<Integer> smallest(BinNode<Integer> current) {
        while (current.hasLeft())
            current = current.getLeft();  // keep going left...
        return current;
    }

    // smallest -- recursive version
    private BinNode<Integer> smallest_recursive(BinNode<Integer> current) {
        if (!current.hasLeft()) {
            return current;
        } else {
            return smallest_recursive(current.getLeft());
        }
    }
    
    // Calculating the tree height (depth from the root to the furthest leaf)
    public int calcHeight() {
        return calcHeight(this.root);
    }
    private int calcHeight(BinNode<Integer> current) {
        if (current == null)
            return -1;  // no tree
        else                                                             // adding 1 because of the root
            return Math.max(calcHeight(current.getLeft()), calcHeight(current.getRight())) + 1;
    }

    public BinNode<Integer> delete(BinNode<Integer> current, int x) {
        // 1. If the current node/root is null, then return null (base case).
        if (current == null)
            return null;

        // 2. If the value to be deleted is SMALLER than the current node value,
        //    recursively call the method on the left subtree. (= go left)
        if (x < current.getValue())
            current.setLeft(delete(current.getLeft(), x));

        // 3. If the value to be deleted is BIGGER than the current node value,
        //    recursively call the method on the right subtree. (= go right)
        else if (x > current.getValue()) {
            current.setRight(delete(current.getRight(), x));
        }

        // 4. If the value to be deleted is EQUAL to the current node value,

        //    handle 3 different cases based on the children of the current node;

        else {
            // 4.1. If the current node has no left child, return the right child.
            //     (the right subtree becomes the new tree).
            if (current.getLeft() == null) {
                return current.getRight();
            }

            // 4.2. If the current node has no right child, return the left child.
            //      (the left subtree becomes the new tree).
            else if (current.getRight() == null) {
                return current.getLeft();
            }

            // 4.3. If the current node has both left and right children:
            //      a. Find the minimum value in the right subtree (by calling the 'smallest()' method).
            //      b. Set the current node value to the min. value found.
            //      c. Recursively call 'delete' on the right subtree with the min. value
            //         in order to delete the node with that value.

            // a. Find the min. val. in the right subtree, and assign it to the current node
            current.setValue(smallest(current.getRight()).getValue());

            // b. Recursively delete the node with the min. val. from the right subtree
            current.setRight(delete(current.getRight(), current.getValue()));
        }

        // 5. Return the current node
        return current;
    }

}