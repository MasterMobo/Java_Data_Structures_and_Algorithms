package DoublyLinkedList;

public class DoublyLinkedList {
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
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void appendNode(int newNodeData) {
        if (head == null) {
            createList(newNodeData);
            return;
        }

        Node newNode = new Node(newNodeData);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void insertNode(int location,int newNodeData) throws Exception{
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

        // Find the desired node
        Node current = head;
        for (int i = 0; i < location; i++) {
            current = current.next;
        }

        Node newNode = new Node(newNodeData);
        newNode.next = current;
        newNode.prev = current.prev;
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

    private void checkLocation(int location) throws Exception {
        if (location < 0) {
            throw new IndexOutOfBoundsException("Location can not be negative");
        }

        if (location >= size) {
            throw new IndexOutOfBoundsException("Location can not exceed maximum value");
        }
    }

    public void deleteNode(int location) throws Exception{
        checkLocation(location);

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

         if (location == 0) {
             head = head.next;
             head.prev = null;
             size--;
             return;
         }

         if (location == size - 1) {
             tail = tail.prev;
             tail.next = null;
             size--;
             return;
         }

         Node current = head;
         for (int i = 0; i < location; i++) {
             current = current.next;
         }

         current.prev.next = current.next;
         current.next.prev = current.prev;
         size--;
    }

    public String showReverse() {
        // Returns reversed string representation without actually reversing the list
        if (size == 0) {
            return "List is empty";
        }
        StringBuilder result = new StringBuilder();

        Node current = tail;
        while (current != null) {
            result.append(current.data);
            if (current != head) result.append(" <-> ");
            current = current.prev;
        }

        return result.toString();
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "List is empty";
        }
        StringBuilder result = new StringBuilder();

        Node current = head;
        while (current != null) {
            result.append(current.data);
            if (current != tail) result.append(" <-> ");
            current = current.next;
        }

        return result.toString();
    }

    public void display() {
        System.out.println(this);
    }

}
