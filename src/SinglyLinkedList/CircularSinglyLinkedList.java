package SinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createList(int newNodeData) {
        Node newNode = new Node(newNodeData);
        newNode.next = newNode;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void prependNode(int newNodeData) {
        if (head == null) {
            this.createList(newNodeData);
            return;
        }

        Node newNode = new Node(newNodeData);

        newNode.next = head;
        head = newNode;
        tail.next = head;
        size++;
    }

    public void appendNode(int newNodeData) {
        if (head == null) {
            this.createList(newNodeData);
            return;
        }

        Node newNode = new Node(newNodeData);
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
    }

    public void insertNode(int location, int newNodeData) throws Exception {
        if (location < 0) {
            throw new IndexOutOfBoundsException("Location can not be negative");
        }

        if (location == 0) {
            this.prependNode(newNodeData);
            return;
        }

        if (location >= size) {
            this.appendNode(newNodeData);
            return;
        }

        int index = 0;
        Node currentNode = head;
        while (index < location - 1) {
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

    public void deleteNode(int location) throws Exception{
        this.checkLocation(location);

        if (size == 1) {
            this.deleteAll();
            return;
        }

        if (location == 0) {
            tail.next = head.next;
            head = head.next;
            size--;
            return;
        }


        Node currentNode = this.getNode(location - 1);
        currentNode.next = currentNode.next.next;

        if (location == size - 1) tail = currentNode;

        size--;
    }

    public void deleteAll() {
        head = null;
        tail = null;
        size = 0;
    }

    private void checkLocation(int location) throws Exception {
        if (location < 0) {
            throw new IndexOutOfBoundsException("Location can not be negative");
        }

        if (location >= size) {
            throw new IndexOutOfBoundsException("Location can not exceed maximum value");
        }
    }

    public void reverse() {
        // Reverse all the nodes in the list (using the three pointer method)
        Node current = head;
        Node next = null;
        Node prev = tail;

        for (int i = 0; i < size; i++) {
            next = current.next;    // Store reference to next node
            current.next = prev;    // Break old reference and replace it with reference to previous node
            prev = current;         // Step to the next node
            current = next;
        }

        tail = head;    // Flip head and tail
        head = prev;
    }


    @Override
    public String toString() {
        if (size == 0) {
            return "List is empty";
        }
        StringBuilder result = new StringBuilder();
        result.append("-> ");
        Node currentNode = head;

        for (int i = 0; i < size; i++) {
            result.append(currentNode.data).append(" -> ");
            currentNode = currentNode.next;
        }

        return result.toString();
    }

    public void display() {
        System.out.println(this);
    }
}
