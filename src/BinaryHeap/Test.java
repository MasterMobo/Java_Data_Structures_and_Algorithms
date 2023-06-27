package BinaryHeap;

public class Test {
    public static void main(String[] args) {
        BinaryHeap heap = new MaxBinaryHeap(4);
        heap.insert(10);
        heap.insert(5);
        heap.insert(15);
        heap.insert(1);
        heap.levelOrder();

        System.out.println(heap.extract());
        System.out.println(heap.extract());
        System.out.println(heap.extract());

        heap.levelOrder();

    }
}
