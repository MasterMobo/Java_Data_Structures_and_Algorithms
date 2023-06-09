package DoublyLinkedList;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{ data=" + data + '}';
    }
}
