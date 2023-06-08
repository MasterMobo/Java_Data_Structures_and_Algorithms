package DoublyLinkedList;

public class CircularDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void createList(int newNodeData) {
        Node newNode = new Node(newNodeData);
        newNode.prev = newNode;
        newNode.next = newNode;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void prependNode(int newNodeData) {
        if (head == null) {
            createList(newNodeData);
            return;
        }

        Node newNode = new Node(newNodeData);
        newNode.next = head;
        newNode.prev = tail;
        head.prev = newNode;
        tail.next = newNode;
        head = newNode;
        size++;
    }

    public void appendNode(int newNodeData) {
        if (head == null) {
            createList(newNodeData);
            return;
        }

        Node newNode = new Node(newNodeData);
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertNode(int location, int newNodeData) throws Exception {
        if (location < 0) {
            throw new IndexOutOfBoundsException("Location can not be negative");
        }

        if (location == 0) {
            prependNode(newNodeData);
            return;
        }

        if (location >= size) {
            appendNode(newNodeData);
            return;
        }

        Node current = head;
        for (int i = 0; i < location; i++) {
            current = current.next;
        }

        Node newNode = new Node(newNodeData);
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }

    public Node getNode(int location) throws Exception {
        this.checkLocation(location);

        if (location == 0) return head;
        if (location == size - 1) return tail;

        Node currentNode = head;
        int index = 0;
        while (index < location) {
            currentNode = currentNode.next;
            index++;
        }

        return currentNode;
    }

    public int getNodeData(int location) throws Exception {
        return this.getNode(location).data;
    }

    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null && currentNode.data != value) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public void updateNode(int location, int newData) throws Exception{
        this.getNode(location).data = newData;
    }

    public void deleteNode(int location) throws Exception{
        checkLocation(location);

        if (size == 1){
            head.prev = null;
            head.next = null;
            head = null;
            tail = null;
            size--;
            return;
        }

        if (location == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
            return;
        }


        Node current = head;
        for (int i = 0; i < location; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        if (location == size - 1) tail = tail.prev;
        size--;
    }

    private void checkLocation(int location) throws Exception {
        if (location < 0) {
            throw new IndexOutOfBoundsException("Location can not be negative");
        }

        if (location >= size) {
            throw new IndexOutOfBoundsException("Location can not exceed maximum value");
        }
    }

    public void deleteAll() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            current.prev = null;
            current = current.next;
        }
        head = null;
        tail = null;
        size = 0;
    }

    public void reverse() {
        Node current = head;
        Node prev = tail;
        Node next = null;
        for (int i = 0; i < size; i++) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }

        tail = head;
        head = prev;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "List is empty";
        }
        StringBuilder result = new StringBuilder();
        result.append("<-> ");

        Node current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.data);
            result.append(" <-> ");
            current = current.next;
        }

        return result.toString();
    }

    public void display() {
        System.out.println(this);
    }
}
