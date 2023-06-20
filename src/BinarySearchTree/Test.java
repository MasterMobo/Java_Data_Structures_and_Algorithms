package BinarySearchTree;

public class Test {
    public static void main(String[] args) {
        BST tree = new BST(10);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(12);
        tree.insert(11);
        tree.insert(13);
        tree.insert(14);
        tree.show();
//        tree.inOrder(tree.root);
//        tree.levelOrder();
        System.out.println("=============================");
        tree.delete(10);
        tree.show();

    }
}
