package BinaryTree;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BinaryTreeArray tree = new BinaryTreeArray(5);
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

        BinaryTreeList treelist = new BinaryTreeList();
        treelist.insert(5);
        treelist.insert(4);
        treelist.insert(3);
        treelist.insert(2);
        treelist.insert(1);
        treelist.insert(6);
        treelist.show(treelist.root, 0);
    }
}
