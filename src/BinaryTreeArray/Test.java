package BinaryTreeArray;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(5);
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        System.out.println(Arrays.toString(tree.arr));
        tree.preOrder(1);
        System.out.println();
        tree.inOrder(1);
        System.out.println();
        tree.postOrder(1);
        System.out.println();
        tree.levelOder();
    }
}
