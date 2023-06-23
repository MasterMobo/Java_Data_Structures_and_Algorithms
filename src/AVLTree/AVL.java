package AVLTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class AVL {
    Node root;

    public AVL() {
        root = null;
    }

    public AVL(Node root) {
        this.root = root;
    }

    public AVL(int val) {this.root = new Node(val);}

    private Node rotateRight(Node disbalancedNode) {
        // Do right rotation
        Node newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;

        // Update heights
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));

        return newRoot;
    }

    private Node rotateLeft(Node disbalancedNode) {
        // Do left rotation
        Node newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;

        // Update heights
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));

        return newRoot;
    }

    private int getBalanceFactor(Node node) {
        // Returns the height difference between the left and right subtree
        if (node == null) return 0;

        return getHeight(node.left) - getHeight(node.right);
    }

    private Node insert(Node node, int val) {
        // Find position to insert new node
        if (node == null) {
            return new Node(val);
        }
        if (val > node.val) {
            node.right = insert(node.right, val);
        } else {
            node.left = insert(node.left, val);
        }

        // Check balance
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalanceFactor(node);
        // Note: Since balance = left.height - right.height,
        // balance > 1 means the height in the left subtree is greater, therefore we consider this condition as left
        // Similarly, balance < -1 means we consider this a right condition

        // Left-left condition
        if (balance > 1 && val < node.left.val) {
            return rotateRight(node);
        }

        // Left-right condition
        if (balance > 1 && val > node.left.val) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // Right-right condition
        if (balance < -1 && val > node.right.val) {
            return rotateLeft(node);
        }

        // Right-left condition
        if (balance < -1 && val < node.right.val) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void insert(int val) {
        root = insert(root, val);
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

    public int getHeight(Node node) {
        if (node == null) return 0;
        return node.height;
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
