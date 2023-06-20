package Stack;

import Stack.QueueViaStack.QueueViaStack;

public class Test {
    public static void main(String[] args) {
        QueueViaStack queue = new QueueViaStack();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

    }
}
