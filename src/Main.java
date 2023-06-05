import SinglyLinkedList.*;

public class Main {
    public static void main(String[] args) throws Exception{
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.appendNode(10);
        sll.appendNode(4);
        sll.appendNode(1);
        sll.insertNode(1, 2);
        sll.prependNode(8);
        sll.insertNode(1, 5);
        System.out.println(sll);

        sll.updateNode(1, 15);
        System.out.println(sll);

        sll.deleteNode(2);
        System.out.println(sll);
    }
}