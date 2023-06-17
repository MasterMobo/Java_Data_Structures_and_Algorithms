package Stack.Plates;

import java.util.ArrayList;
import java.util.Arrays;

public class StackSet {
    ArrayList<PlateStack> arr;
    int capacity; // Capacity of each stack

    public StackSet(int capacity) {
        this.capacity = capacity;
        arr = new ArrayList<>();
        arr.add(new PlateStack(capacity));
    }

    public PlateStack getLast() {
        return arr.get(arr.size() - 1);
    }

    public void push(int val) {
        PlateStack last = getLast();
        if (last.isFull()) {
            PlateStack newStack = new PlateStack(capacity);
            newStack.push(val);
            arr.add(newStack);
            return;
        }

        last.push(val);
    }

    public int pop() throws Exception {
        PlateStack last = getLast();
        if (last == null) throw new Exception("Stack is empty");
        int res = last.pop();

        if (last.isEmpty()) arr.remove(arr.size() - 1);

        return res;
    }

    public int popAt(int stackIndex) throws Exception{
        if (stackIndex == arr.size() - 1) return pop();
        if (stackIndex == 0) return arr.get(0).pop();

        PlateStack currentStack = arr.get(stackIndex);
        int res = currentStack.pop();
        PlateStack prevStack = arr.get(stackIndex - 1);
        int prevStackBottom = prevStack.removeBottom();

        currentStack.bottom.below = new PlateNode(prevStackBottom);
        currentStack.bottom = currentStack.bottom.below;
        currentStack.size++;
        if (prevStack.isEmpty()) arr.remove(stackIndex - 1);

        return res;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.size() - 1; i++) {
            result.append(arr.get(i).toString());
            result.append(",\n");
        }
        result.append(getLast().toString());

        return result.toString();
    }
}
