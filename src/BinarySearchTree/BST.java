package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public BST(int val) {
        root = new Node(val);
    }

    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
            return;
        }

        Node current = root;
        Node prev = current;

        while (current != null) {
            prev = current;
            if (val > current.val) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        if (val > prev.val) {
            prev.right = new Node(val);
        } else {
            prev.left = new Node(val);
        }
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
        Node current = root;

        while (current != null) {
            if (val > current.val) {
                current = current.right;
            } else if (val < current.val) {
                current = current.left;
            } else {
                return current;
            }
        }

        return current;
    }

    public Node successor(Node node) {
        // Returns the smallest node in the right subtree
        Node current = node.right;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    private Node delete(Node node, int val) {
        if (node == null) return null;

        if (val > node.val) {
            node.right = delete(node.right, val);
        } else if (val < node.val) {
            node.left = delete(node.left, val);
        } else {
            if (node.left != null && node.right != null) {
                Node successor = successor(node);
                node.val = successor.val;
                node.right = delete(node.right, successor.val);
            } else if (node.left != null) {
                node = node.left;
            } else if (node.right != null) {
                node = node.right;
            } else {
                node = null;
            }

        }
        return node;
    }

    public void delete(int val) {
        delete(root, val);
    }

    public void deleteAll() {
        root = null;
    }

    private void show(Node node, int level) {
        if (node == null) return;

        show(node.right, level + 1);
        System.out.println("   ".repeat(level) + node.val);
        show(node.left, level + 1);
    }

    public void show() {
        show(root, 0);
    }
}
