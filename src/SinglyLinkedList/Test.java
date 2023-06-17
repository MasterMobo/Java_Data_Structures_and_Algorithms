package SinglyLinkedList;

public class Test {
    public static void run() throws Exception{
//        System.out.println("== Singly Linked List ============================");
//        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.appendNode(10);
//        sll.appendNode(4);
//        sll.appendNode(1);
//        sll.insertNode(1, 2);
//        sll.prependNode(8);
//        sll.insertNode(2, 5);
//        System.out.println(sll);
//
//        sll.updateNode(1, 15);
//        System.out.println(sll);
//
//        sll.deleteNode(2);
//        System.out.println(sll);
//
//        sll.reverse();
//        System.out.println(sll);
//
//        sll.deleteAll();
//        System.out.println(sll);
//
//        System.out.println("== Circular Singly Linked List ============================");
//        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//        csll.prependNode(5);
//        csll.prependNode(3);
//        csll.appendNode(7);
//        csll.appendNode(0);
//
//        csll.insertNode(2, 10);
//        csll.deleteNode(3);
//        System.out.println(csll);
//        csll.reverse();
//        System.out.println(csll);

        SinglyLinkedList zerosSum = new SinglyLinkedList();
        zerosSum.appendNode(0);
        zerosSum.appendNode(1);
        zerosSum.appendNode(2);
        zerosSum.appendNode(3);
        zerosSum.appendNode(0);
        zerosSum.appendNode(4);
        zerosSum.appendNode(5);
        zerosSum.appendNode(0);
        zerosSum.appendNode(6);
        zerosSum.appendNode(0);
        System.out.println(SinglyLinkedList.sumBetweenZeros(zerosSum.head));
    }
}
