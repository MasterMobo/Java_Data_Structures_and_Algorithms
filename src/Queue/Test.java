package Queue;

public class Test {
    public static void run() {
//        System.out.println("== Queue Array =======================================");
//        QueueArray queue = new QueueArray(5);
//        queue.enQueue(1);
//        queue.enQueue(2);
//        queue.enQueue(3);
//        queue.enQueue(4);
//        queue.enQueue(5);
//        System.out.println(queue);
//        queue.deQueue();
//        queue.deQueue();
//        System.out.println(queue);

//        System.out.println("== Circular Queue Array =======================================");
//        CircularQueueArray cQueue = new CircularQueueArray(5);
//        cQueue.enQueue(1);
//        cQueue.enQueue(2);
//        cQueue.enQueue(3);
//        cQueue.enQueue(4);
//        cQueue.enQueue(5);
//        System.out.println(cQueue);
//        System.out.println(cQueue.deQueue());
//        System.out.println(cQueue.deQueue());
//        System.out.println(cQueue);
//        cQueue.enQueue(10);
//        cQueue.enQueue(11);
//        System.out.println(cQueue);

        System.out.println("== Queue List =======================================");
        QueueList lQueue = new QueueList();
        lQueue.enQueue(1);
        lQueue.enQueue(2);
        lQueue.enQueue(3);
        lQueue.enQueue(4);
        lQueue.enQueue(5);
        System.out.println(lQueue);
        System.out.println(lQueue.deQueue());
        System.out.println(lQueue.deQueue());
        System.out.println(lQueue);
        lQueue.enQueue(10);
        lQueue.enQueue(11);
        lQueue.enQueue(12);
        lQueue.enQueue(13);
        System.out.println(lQueue);

    }
}
