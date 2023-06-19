package BinaryTreeList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    // Binary Tree Implementation using Singly Linked List
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Pre-order Traversal
    public void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // In-order Traversal
    public void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    // Post-order Traversal
    public void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    // Level-order Traversal
    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node current;
        while (!queue.isEmpty()) {
            current = queue.remove();
            System.out.print(current.val + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public Node search(int val) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node current;

        while (!queue.isEmpty()) {
            current = queue.remove();
            if (current.val == val) return current;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }

        return null;
    }

    public void show(Node node, int level) {
        if (node == null) return;

        System.out.println(" ".repeat(level) + node.val);
        show(node.left, level + 1);
        show(node.right, level + 1);
    }

}