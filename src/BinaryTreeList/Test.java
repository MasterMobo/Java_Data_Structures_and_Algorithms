package BinaryTreeList;

public class Test {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(4);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(12);
        tree.root.left.right = new Node(11);
        tree.root.right.left = new Node(9);

        tree.levelOrder();
        System.out.println(tree.search(12));
    }
}
