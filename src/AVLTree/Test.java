package AVLTree;

public class Test {
    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 1; i <= 10; i++) {
            tree.insert(i);
        }

        tree.show();
        tree.inOrder(tree.root);
    }
}
