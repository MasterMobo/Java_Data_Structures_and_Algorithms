package Stack;

import SinglyLinkedList.*;

public class StackList {
    // Stack implementation using Singly Linked List. Variable size.
    SinglyLinkedList list;

    public StackList() {
        list = new SinglyLinkedList();
    }

    public StackList(int val) {
        list = new SinglyLinkedList();
        list.prependNode(val);
    }

    public void push(int val) {
        list.prependNode(val);
    }

    public int pop() {
        if (isEmpty()) return - 1;

        int returnVal = list.head.data;
        list.head = list.head.next;
        return returnVal;
    }

    public int peek() {
        if (isEmpty()) return - 1;

        return list.head.data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }
}
