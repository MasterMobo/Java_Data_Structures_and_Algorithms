package AVLTree;

public class Test {
    public static void main(String[] args) {
        AVL tree = new AVL();
//        for (int i = 1; i <= 10; i++) {
//            tree.insert(i);
//        }
        tree.insert(5);
        tree.insert(10);
        tree.insert(15);
        tree.insert(20);

        tree.delete(10);
//        tree.delete(1);

        tree.show();
        tree.inOrder(tree.root);
    }
}
