package Stack.QueueViaStack;

import Stack.StackList;

public class QueueViaStack {
    StackList stack1;
    StackList stack2;

    public QueueViaStack() {
        stack1 = new StackList();
        stack2 = new StackList();
    }

    public void enQueue(int val) {
        stack1.push(val);
    }

    public int deQueue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {
        return stack2.peek();
    }
}
