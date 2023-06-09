package Stack;

public class StackArray {
    // Stack implementation using Array. Fixed size.
    int[] arr;
    int top;

    public StackArray(int size) {
        this.arr = new int[size];
        int top = -1;
    }

    public void push(int val) {
        if (isFull()) return;

        arr[top+1] = val;
        top++;
    }

    public int pop() {
        if (isEmpty()) return -1;

        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) return -1;

        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void delete() {
        arr = null;
    }
}
