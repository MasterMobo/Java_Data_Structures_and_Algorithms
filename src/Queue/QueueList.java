package Queue;

import SinglyLinkedList.*;

public class QueueList {
    // Queue implementation using Singly Linked List. Variable size. No blank spaces.
    SinglyLinkedList list;

    public QueueList() {
        list = new SinglyLinkedList();
    }

    public void enQueue(int val) {
        list.appendNode(val);
    }

    public int deQueue() {
        if (isEmpty()) return -1;

        int res = list.head.data;
        list.head = list.head.next;
        return res;
    }

    public int peek() {
        return list.head.data;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void delete(){
        list = null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = list.head;
        while (current != null) {
            result.append(current.data).append(", ");
            current = current.next;
        }
        return result.toString();
    }
}
