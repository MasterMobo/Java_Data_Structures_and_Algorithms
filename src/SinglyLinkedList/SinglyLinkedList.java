package SinglyLinkedList;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public Node createSinglyLinkedList(int newNodeData) {
        Node newNode = new Node(newNodeData);
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    public void appendNode(int newNodeData) {
        // Add node to end of list
        if (head == null) {
            createSinglyLinkedList(newNodeData);
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
            createSinglyLinkedList(newNodeData);
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
            appendNode(newNodeData);
            return;
        }

        if (location >= size) {
            prependNode(newNodeData);
            return;
        }

        // Find the node at the desired location
        Node currentNode = head;
        int index = 0;
        while (index < location - 1) {
            currentNode = currentNode.next;
            index++;
        }

        Node newNode = new Node(newNodeData);
        Node oldNextNode = currentNode.next;
        currentNode.next = newNode;
        newNode.next = oldNextNode;
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

        if (location == 0){
            Node oldHead = head;
            head = head.next;
            oldHead = null;
            return;
        }


        Node foundNode = this.getNode(location - 1);
        Node oldNextNode = foundNode.next.next;
        foundNode.next = null;
        foundNode.next = oldNextNode;
        if (location == size - 1) tail = foundNode;

    }

    public void checkLocation(int location) throws Exception {
        if (location < 0) {
            throw new IndexOutOfBoundsException("Location can not be negative");
        }

        if (location >= size) {
            throw new IndexOutOfBoundsException("Location can not exceed maximum value");
        }
    }

    @Override
    public String toString() {
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
