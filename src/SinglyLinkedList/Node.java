package SinglyLinkedList;

class Node {
    int data;

    Node next;

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node (int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{ data=" + data + '}';
    }
}
