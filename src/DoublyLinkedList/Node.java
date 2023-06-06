package DoublyLinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{ data=" + data + '}';
    }
}
