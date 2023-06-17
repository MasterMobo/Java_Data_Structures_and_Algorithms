package DoublyLinkedList;

public class Test {
    public static void run() throws Exception{
//        System.out.println("== Doubly Linked List ==========================");
//        DoublyLinkedList dll = new DoublyLinkedList();
//        dll.prependNode(9);
//        dll.prependNode(8);
//        dll.prependNode(7);
//        dll.appendNode(10);
//        dll.insertNode(2, 30);
//        dll.deleteNode(3);
//        System.out.println(dll);
//        dll.reverse();
//        System.out.println(dll);
//        dll.deleteAll();
//        System.out.println(dll);
//        System.out.println(dll.showReverse());

        System.out.println("== Circular Doubly Linked List ==========================");
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.prependNode(3);
        cdll.prependNode(2);
        cdll.prependNode(1);
        cdll.appendNode(5);
        cdll.appendNode(6);
        cdll.appendNode(7);
        cdll.insertNode(2, 30);
        cdll.deleteNode(0);
        cdll.deleteNode(cdll.size - 1);
        cdll.deleteNode(1);
        System.out.println(cdll);
        cdll.reverse();
        System.out.println(cdll);

    }
}
