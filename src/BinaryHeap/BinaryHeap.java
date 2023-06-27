package BinaryHeap;

public abstract class BinaryHeap {
    int[] arr;
    int size;

    public BinaryHeap(int capacity) {
        arr = new int[capacity + 1];
        this.size = 0;
    }

    public void levelOrder() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    abstract protected void heapifyToBottom(int index);

    abstract protected void heapifyToTop(int index);

    public int extract() {
        if (isEmpty()) return -1;

        int res = arr[1];

        arr[1] = arr[size--];
        heapifyToTop(1);

        return res;
    }

    public void insert(int val) {
        if (isFull()) return;

        arr[++size] = val;
        heapifyToBottom(size);
    }

    protected void swap(int i1, int i2) {
        arr[i1] = arr[i1] + arr[i2];
        arr[i2] = arr[i1] - arr[i2];
        arr[i1] = arr[i1] - arr[i2];
    }

    public boolean isFull() {return size == arr.length - 1;}
    public boolean isEmpty() {return size == 0;}

    public void deleteAll() {
        arr = null;
        size = 0;
    }
}
