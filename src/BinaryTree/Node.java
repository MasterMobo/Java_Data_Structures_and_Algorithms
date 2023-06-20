package BinaryTree;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public int height;

    public Node() {}
    public Node(int val) {
        this.val = val;
    }
    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
