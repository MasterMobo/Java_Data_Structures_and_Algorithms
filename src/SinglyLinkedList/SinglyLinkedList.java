package SinglyLinkedList;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public Node getHead() { return head; }

    public Node getTail() { return tail; }

    public void createList(int newNodeData) {
        Node newNode = new Node(newNodeData);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void appendNode(int newNodeData) {
        // Add node to end of list
        if (head == null) {
            this.createList(newNodeData);
            return;
        }

        Node newNode = new Node(newNodeData);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void prependNode(int newNodeData) {
        // Add node to beginning of list
        if (head == null) {
            this.createList(newNodeData);
            return;
        }

        Node newNode = new Node(newNodeData);
        newNode.next = head;
        head = newNode;
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

        // Find the node at the desired location
        Node currentNode = head;
        int index = 0;
        while (index < location - 1) {  // We're using location - 1 because we want access to the previous node of the wanted location
            currentNode = currentNode.next;
            index++;
        }

        Node newNode = new Node(newNodeData);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
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
        this.checkLocation(location);

        if (size == 1) {
            this.deleteAll();
            return;
        }

        if (location == 0){
            head = head.next;
            size--;
            return;
        }

        Node foundNode = this.getNode(location - 1);
        foundNode.next = foundNode.next.next;

        if (location == size - 1) tail = foundNode;

        size--;
    }

    public void deleteAll() {
        head = null;
        tail.next = null;
        tail = null;
        size = 0;
    }

    public void reverse() {
        // Reverse all the nodes in the list (using the three pointer method)
        Node current = head;
        Node next = null;
        Node prev = null;

        while (current != null) {
            next = current.next;    // Store reference to next node
            current.next = prev;    // Break old reference and replace it with reference to previous node
            prev = current;         // Step to the next node
            current = next;
        }

        tail = head;    // Flip head and tail
        head = prev;
    }

    private void checkLocation(int location) throws Exception {
        if (location < 0) {
            throw new IndexOutOfBoundsException("Location can not be negative");
        }

        if (location >= size) {
            throw new IndexOutOfBoundsException("Location can not exceed maximum value");
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "List is empty";
        }
        StringBuilder result = new StringBuilder();
        Node currentNode = head;

        while (currentNode != null) {
            result.append(currentNode.data);
            if (currentNode != tail) result.append(" -> ");
            currentNode = currentNode.next;
        }

        return result.toString();
    }

    public void display() {
        System.out.println(this);
    }
}
