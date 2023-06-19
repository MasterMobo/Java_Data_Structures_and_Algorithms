package Stack;

import Stack.Plates.PlateStack;
import Stack.Plates.StackSet;
import Stack.QueueViaStack.QueueViaStack;

public class Test {
    public static void main(String[] args) {
//        StackList stack = new StackList(10);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        StackSet stacks = new StackSet(3);
//        stacks.push(1);
//        stacks.push(2);
//        stacks.push(3);
//        stacks.push(4);
//        stacks.push(5);
//        stacks.push(6);
//        stacks.push(7);
//        stacks.push(8);
//
//        System.out.println(stacks);
//        System.out.println();
//        System.out.println(stacks.popAt(1));
//        System.out.println(stacks.popAt(1));
////        System.out.println(stacks.popAt(1));
//
//        System.out.println(stacks);
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
