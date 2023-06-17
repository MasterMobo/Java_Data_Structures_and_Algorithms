package Stack.Plates;

public class PlateStack {
    PlateNode top;
    PlateNode bottom;
    int capacity;
    int size;

    public PlateStack(int capacity) {
        this.capacity = capacity;
        int size = 0;
    }

    public void push(int val) {
        if (isFull()) return;

        if (size == 0) {
            PlateNode newNode = new PlateNode(val);
            top = newNode;
            bottom = newNode;
            size++;
            return;
        }

        PlateNode newNode = new PlateNode(val);
        newNode.below = top;
        newNode.below.above = newNode;
        top = newNode;
        size++;
    }

    public int pop() throws Exception {
        if (isEmpty()) throw new Exception("List is empty");
        if (size == 1) {
            int res = top.val;
            top = null;
            bottom = null;
            size = 0;
            return res;
        }
        int res = top.val;
        top.below.above = null;
        top = top.below;
        size--;
        return res;
    }

    public int removeBottom() throws Exception {
        if (size == 1) {
            int res = top.val;
            top = null;
            bottom = null;
            size = 0;
            return res;
        }
        int temp = bottom.val;
        bottom = bottom.above;
        bottom.below = null;
        size--;
        return temp;
    }

    public boolean isFull() {
        return size >= capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        PlateNode current = top;
        while (current != bottom) {
            result.append(current.val);
            result.append(", ");
            current = current.below;
        }
        result.append(bottom.val);
        result.append("]");
        return result.toString();
    }
}
