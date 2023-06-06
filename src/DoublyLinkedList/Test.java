package DoublyLinkedList;

public class Test {
    public static void run() throws Exception{
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.prependNode(9);
        dll.prependNode(8);
        dll.prependNode(7);
        dll.appendNode(10);
        dll.appendNode(11);
        dll.appendNode(12);
        dll.insertNode(2, 30);
        dll.deleteNode(3);
        System.out.println(dll);
//        System.out.println(dll.showReverse());
    }
}
