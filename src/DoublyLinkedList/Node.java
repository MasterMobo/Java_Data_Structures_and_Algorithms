package DoublyLinkedList;

class Node {
    int data;
    Node next;
    Node prev;

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
