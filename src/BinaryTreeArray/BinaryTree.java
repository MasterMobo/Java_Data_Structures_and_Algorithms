package BinaryTreeArray;

public class BinaryTree {
    int[] arr;
    int lastInd;

    public BinaryTree(int size) {
        arr = new int[size + 1];
        lastInd = 0;
    }

    public boolean isFull() {
        return lastInd == arr.length;
    }

    public void insert(int val) {
        if (isFull()) return;

        arr[++lastInd] = val;
    }

    public void preOrder(int index) {
        if (index > lastInd) return;

        System.out.print(arr[index] + " ");
        preOrder(2*index);
        preOrder(2*index + 1);
    }

    public void inOrder(int index) {
        if (index > lastInd) return;

        inOrder(2*index);
        System.out.print(arr[index] + " ");
        inOrder(2*index + 1);
    }

    public void postOrder(int index) {
        if (index > lastInd) return;

        postOrder(2*index);
        postOrder(2*index + 1);
        System.out.print(arr[index] + " ");
    }

    public void levelOder() {
        for (int i = 1; i <= lastInd; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int search(int val) {
        for (int i = 1; i <= lastInd; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    public void delete(int val) {
        for (int i = 1; i <= lastInd; i++) {
            if (arr[i] == val) {
                arr[i] = arr[lastInd];
                lastInd--;
            }
        }
    }

    public void deleteAll() {
        arr = null;
    }
}
