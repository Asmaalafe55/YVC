package data_structure_assignments.ex2;

class AVLTree {

    // declaring a root variable
    BinNode<Integer> root;

    // return the height of the tree
    private int height(BinNode<Integer> node) {
        if (node == null)
            return -1;

        return node.getHeight();
    }
    
    // return the balance factor of a node
    private int getBalance(BinNode<Integer> node) {
        if (node == null)
            return 0;
                // left_node_height  minus  right_node_height
        return height(node.getLeft()) - height(node.getRight());
    }
    
    // get the maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // RR rotation -- performs a left rotation on the given node in an AVL tree. -relevant to an insert operation
    BinNode<Integer> leftRotate(BinNode<Integer> node) {

        BinNode<Integer> newRoot = node.getRight();  // the new root gets its value from the right child of the root (node)
        node.setRight(newRoot.getLeft());            // setting the node's right child -what was previously a left child of the newRoot
        newRoot.setLeft(node);                       // the original node becomes the left child of the newRoot
        
        // updating the heights of node and newRoot
        node.setHeight(1 + max(height(node.getLeft()), height(node.getRight())));
        newRoot.setHeight(1 + max(height(newRoot.getLeft()), height(newRoot.getRight())));

        return newRoot;
    }
    
    // LL rotation -- performs a right rotation on the given node in an AVL tree. -relevant to an insert operation
    BinNode<Integer> rightRotate(BinNode<Integer> node) {
    
        BinNode<Integer> newRoot = node.getLeft();  // the new root gets its value from the left child of the root (node)
        node.setLeft(newRoot.getRight());           // setting the node's left child -what was previously a right child of the newRoot
        newRoot.setRight(node);                     // the original node becomes the right child

        // updating the heights of node and newRoot
        node.setHeight(1 + max(height(node.getLeft()), height(node.getRight())));
        newRoot.setHeight(1 + max(height(newRoot.getLeft()), height(newRoot.getRight())));

        return newRoot;
    }

    // find the largest value in the tree
    public int biggest() throws Exception {
        if (root == null)
            throw new Exception("Tree is Empty");

        return biggest(this.root).getValue();
    }
    // helper method which traverses the tree recursively
    private BinNode<Integer> biggest(BinNode<Integer> current) {
        if (!current.hasRight())
            return current;

        return biggest(current.getRight());
    }

    // find the smallest value in the tree
    public int smallest() throws Exception {
        if (root == null)
            throw new Exception("Tree is Empty");

        return smallest(this.root).getValue();
    }
    // helper method which traverses the tree - iteratively
    private BinNode<Integer> smallest(BinNode<Integer> current) {
        while (current.hasLeft())
            current = current.getLeft();

        return current;
    }
    
    /*
        Alternative version - recursively:
        
        private BinNode<Integer> smallest(BinNode<Integer> current) {
          if (current.hasLeft()) {
            return smallest(current.getLeft());
          } else {
            return current;
          }
        }
    */

    public void insert(int key) {
        if (root == null) 
            root = new BinNode<>(key);
        else 
            root = insert(root, key);
    }
    // helper method
    private BinNode<Integer> insert(BinNode<Integer> current, int key) {

        // 1. Perform a normal BST insertion
        // The first step is a standard BST insertion.
        // If the key to be inserted is less than the node's key, then the key is inserted into the left subtree.
        // If the key to be inserted is greater than the node's key, then the key is inserted into the right subtree.
        // If the key is equal to the node's key, the key is not inserted
        // (since in our implementation duplicate keys are not allowed in a BST).

        if (current == null)
            return new BinNode<Integer>(key);

        if (key < current.getValue())
            current.setLeft(insert(current.getLeft(), key));
        
        // continue search on right side
        else if (key > current.getValue())
            current.setRight(insert(current.getRight(), key));
        
        // Duplicate keys are not allowed
        else
            return null;
        
        // 2. Update height of this ancestor node
        // After the BST insertion, the height of the node is updated.
        // The height of a node is the maximum height of its two children + 1.
        current.setHeight(1 + max(height(current.getLeft()), height(current.getRight())));
        
        // 3. Get the balance factor of this ancestor node to check whether this node became unbalanced
        // The balance factor of the node is calculated like this: balance(node) = height(node.leftChild) - height(node.rightChild).
        // If the balance factor is greater than 1 or less than -1, then the node is unbalanced.
        int balance = getBalance(current);
        int leftChildBalance = getBalance(current.getLeft());
        int rightChildBalance = getBalance(current.getRight());
        
        
        /* If this node is unbalanced, then there are 4 cases: */

        // Left-Left Case
        // Left Left Case: The key to be inserted is inserted into the left subtree of the left child of the unbalanced node.
        // The balance factor of the unbalanced node is 2 and the balance factor of its left child is 1.
        // This case is handled by a single right rotation on the unbalanced node.

        // Before rotation
        //    A
        //   /
        //  B
        // /
        //C

        // After right rotation
        //  B
        // / \
        //C   A
        if (balance == 2 && leftChildBalance == 1)
            current = rightRotate(current);
        
        // Right-Right Case
        // Right Right Case: The key to be inserted is inserted into the right subtree of the right child of the unbalanced node.
        // The balance factor of the unbalanced node is -2 and the balance factor of its right child is -1.
        // This case is handled by a single left rotation on the unbalanced node.

        // Before rotation
        // A
        //  \
        //   B
        //    \
        //     C

        // After left rotation
        //   B
        //  / \
        // A   C
        else if (balance == -2 && rightChildBalance == -1)
            current = leftRotate(current);

        // Left Right Case
        // Left Right Case: The key to be inserted is inserted into the right subtree of the left child of the unbalanced node.
        // The balance factor of the unbalanced node is 2 and the balance factor of its left child is -1.
        // This case is handled by a left rotation on the left child of the unbalanced node, followed by a right rotation on the unbalanced node.

        // Before rotation
        //    A
        //   /
        //  B
        //   \
        //    C

        // After 2 rotations(left rotation and then right rotation)
        //  C
        // / \
        //B   A
        else if (balance == 2 && leftChildBalance == -1) {
            current.setLeft(leftRotate(current.getLeft()));
            current = rightRotate(current);
        }

        // Right-Left Case
        // Right Left Case: The key to be inserted is inserted into the left subtree of the right child of the unbalanced node.
        // The balance factor of the unbalanced node is -2 and the balance factor of its right child is 1.
        // This case is handled by a right rotation on the right child of the unbalanced node, followed by a left rotation on the unbalanced node.
        // Before rotation
        // A
        //  \
        //   B
        //  /
        // C

        // After 2 rotations(right rotation and then left rotation)
        //  C
        // / \
        //A   B
        else if (balance == -2 && rightChildBalance == 1) {
            current.setRight(rightRotate(current.getRight()));
            current = leftRotate(current);
        }

        // In each case, the appropriate rotation restores the balance of the tree.
        // The current node is updated to point to the new root of the subtree after the rotations.
        return current;
    }

    public void deleteNode(int key) {
        if (root != null)
            root = deleteNode(root, key);
    }

    // helper method
    private BinNode<Integer> deleteNode(BinNode<Integer> root, int key) {

        // step 1: standard BST delete
        // The first step is a standard BST deletion.
        // If the key to be deleted is less than the root's key, then the key is deleted from the left subtree.
        // If the key to be deleted is greater than the root's key, then the key is deleted from the right subtree.
        // If the key is equal to the root's key, the root node is deleted.
        // If the root node has one or no child, it's replaced by its child (if any).
        // If the root node has two children, it's replaced by its successor
        // (the node with the smallest key in the right subtree), and then the successor is deleted.

        if (root == null)
            return root;

        // If the key to be deleted is smaller than the root's key, then it lies in left subtree
        if (key < root.getValue())
            root.setLeft(deleteNode(root.getLeft(), key));

        // else if the key to be deleted is greater than the root's key, then it lies in right subtree
        else if (key > root.getValue())
            root.setRight(deleteNode(root.getRight(), key));

        // else, the key is same as root's key, then this is the node to be deleted
        else {
            // node with only one child or no child
            if ((root.getLeft() == null) || (root.getRight() == null)) {
                BinNode<Integer> temp = null;

                if (temp == root.getLeft())
                    temp = root.getRight();
                else
                    temp = root.getLeft();

                // no child case
                if (temp == null) {
                    temp = root;
                    root = null;
                }
                // One child case
                else
                    root = temp; // Copy the contents of the non-empty child
            } else {
                // node with two children: Get the in-order
                // successor (smallest in the right subtree)
                BinNode<Integer> temp = smallest(root.getRight());

                // Copy the inorder successor's data to this node
                root.setValue(temp.getValue());

                // Delete the inorder successor
                root.setRight(deleteNode(root.getRight(), temp.getValue()));
            }
        }

        // If the tree had only one node then return
        if (root == null)
            return root;

        // step 2: update the height of the current node
        // After the BST deletion, the height of the root node is updated.
        // The height of a node is the maximum height of its two children + 1.
        root.setHeight(max(height(root.getLeft()), height(root.getRight())) + 1);

        // step 3: get the Balance Factor for this node (to check whether this node has become unbalanced or not)
        // The balance factor of the root node is calculated.
        // If the balance factor is greater than 1 or less than -1, then the root node is unbalanced.
        int balance = getBalance(root);


        /* If this node becomes unbalanced, then there are 4 cases: */

        // If the root node is unbalanced, there are 4 cases to handle.
        // By checking the balance factor of the child nodes, we can determine the correct rotation operation to balance the tree.

        // Left-Left Case: The balance factor of the left child is greater than or equal to 0.
        // This case is handled by a single right rotation.
        if (balance > 1 && getBalance(root.getLeft()) >= 0)
            return rightRotate(root);

        // Left-Right Case: The balance factor of the left child is less than 0.
        // This case is handled by a left rotation followed by a right rotation.
        if (balance > 1 && getBalance(root.getLeft()) < 0) {
            root.setLeft(leftRotate(root.getLeft()));
            return rightRotate(root);
        }

        // Right-Right Case: The balance factor of the right child is less than or equal to 0.
        // This case is handled by a single left rotation.
        if (balance < -1 && getBalance(root.getRight()) <= 0)
            return leftRotate(root);

        // Right-Left Case: The balance factor of the right child is greater than 0.
        // This case is handled by a right rotation followed by a left rotation.
        if (balance < -1 && getBalance(root.getRight()) > 0) {
            root.setRight(rightRotate(root.getRight()));
            return leftRotate(root);
        }

        // Finally, the (possibly new) root node is returned.
        return root;
    }

    public void preOrder() {
        preOrder(root);
    }

    // print preorder traversal of the tree.
    // The method also prints the height of every node
    private void preOrder(BinNode<Integer> node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        /* Constructing tree given in the above figure */
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);
        tree.insert(27);

        // given this order of the elements, we will get the below AVL tree:
        /*
             30
            /  \
          20   40
         /  \    \
        10  25   50
             \
             27
        */
        System.out.println("\nPreorder traversal of the constructed tree: ");
        tree.preOrder();
        System.out.println();

        tree.deleteNode(10);
        // After deleting 10
        /* The constructed AVL Tree would be:
             30
            /   \
          25      40
         /  \      \
        20  27     50
        */
        System.out.println("\ndelete 10");
        System.out.println("Preorder traversal of the constructed tree: ");
        tree.preOrder();

        tree.deleteNode(30);
        // After deleting 30
        /* The constructed AVL Tree would be
             27
            /   \
          25     40
         /         \
        20         50
        */
        System.out.println("\n\ndelete 30");
        System.out.println("Preorder traversal of the constructed tree: ");
        tree.preOrder();
        System.out.println();
    }

}
