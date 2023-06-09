package Stack;

import SinglyLinkedList.*;

public class StackList {
    // Stack implementation using Singly Linked List. Variable size.
    SinglyLinkedList list;
    Node top;

    public StackList() {
        list = new SinglyLinkedList();
    }

    public StackList(int val) {
        list = new SinglyLinkedList();
        top = list.createList(val);
    }

    public void push(int val) {
        list.appendNode(val);
    }

    public int pop() {
        if (isEmpty()) return - 1;

        int returnVal = top.data;
        list.head = list.head.next;
        top = top.next;
        return returnVal;
    }

    public int peek() {
        if (isEmpty()) return - 1;

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
