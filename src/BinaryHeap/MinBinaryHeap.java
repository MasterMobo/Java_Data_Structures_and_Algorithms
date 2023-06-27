package BinaryHeap;

public class MinBinaryHeap extends BinaryHeap{
    public MinBinaryHeap(int capacity) {
        super(capacity);
    }

    @Override
    protected void heapifyToBottom(int index) {
        int current = index;

        while (current > 1) {
            int parent = current/2;
            if (arr[current] < arr[parent]) swap(current, parent);
            current = parent;
        }
    }

    @Override
    protected void heapifyToTop(int index) {
        int current = index;
        int left = 2 * current;
        int right = 2 * current + 1;

        while (left <= size) {
            if (arr[left] > arr[current] && arr[right] > arr[current]) return;

            int swapChild = left;

            if (arr[left] < arr[index] && arr[right] < arr[index]) {
                if (arr[right] < arr[left]) swapChild = right;
            } else if (arr[right] < arr[index]) {
                swapChild = right;
            }

            swap(swapChild, index);
            current = swapChild;
            left = 2 * current;
            right = 2 * current + 1;
        }

    }
}
