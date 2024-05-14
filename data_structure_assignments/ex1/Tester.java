package data_structure_assignments.ex1;

public class Tester {
    public static void main(String[] args) {
        BinSearchTree<Integer> bst = new BinSearchTree<>();

        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        System.out.println("Inorder traversal of the binary search tree:");
        bst.printInOrder();

        System.out.println("\n\nDeleting node with value 30...");
        bst.delete(bst.getRoot(), 30);

        System.out.println("\nInorder traversal after deletion:");
        bst.printInOrder();
    }
}