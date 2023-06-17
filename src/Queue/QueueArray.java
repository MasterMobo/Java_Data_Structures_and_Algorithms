package Queue;

import java.util.Arrays;

public class QueueArray {
    // Linear Queue implementation using Array. Fixed size. Will produce blank spaces.
    int[] arr;
    int start;
    int end;

    public QueueArray(int size) {
        arr = new int[size];
        start = -1;
        end = -1;
    }

    public void enQueue(int val) {
        if (isFull()) return;

        if (isEmpty()) start = 0;

        arr[++end] = val;
    }

    public int deQueue() {
        if (isEmpty()) return -1;
        int result = arr[start++];
        if (start > end) {  // If Queue is empty, reset pointers
            start = -1;
            end = -1;
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arr[start];
    }

    public boolean isFull() {
        return end == arr.length - 1;
    }

    public boolean isEmpty() {
        return start == -1 || start == arr.length;
    }

    public void delete() {
        arr = null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(arr[i]);
            if (i != end) result.append(", ");
        }
        return result.toString();
    }
}
