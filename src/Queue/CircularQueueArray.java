package Queue;

import java.util.Arrays;

public class CircularQueueArray {
    // Circular Queue implementation using Array. Fixed size. No blank spaces.
    int[] arr;
    int start;
    int end;

    public CircularQueueArray(int size) {
        arr = new int[size];
        start = -1;
        end = -1;
    }

    public void enQueue(int val) {
        if (isFull()) return;
        if (isEmpty()) {
            start = 0;
            arr[++end] = val;
            return;
        }

        end = (end == arr.length-1)? 0 : end+1;

        arr[end] = val;
    }

    public int deQueue() {
        if (isEmpty()) return -1;
        if (start == end) {
            start = -1;
            end = -1;
        }

        int res = arr[start];
        start = (start == arr.length-1)? 0 : start+1;

        return res;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arr[start];
    }

    public boolean isFull() {
        return (start==0 && end== arr.length-1) || (end + 1 == start);
    }

    public boolean isEmpty() {
        return start == -1;
    }

    public void delete() {
        arr = null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int i = start;
        while (i != end) {
            if (i == arr.length) i = 0;

            result.append(arr[i]).append(", ");

            i++;
        }
        result.append(arr[end]).append(", ");
        return result.toString();
    }
}
