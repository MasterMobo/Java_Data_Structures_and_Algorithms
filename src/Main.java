//import DoublyLinkedList;

public class Main {
    public static void main(String[] args) throws Exception{
//        SinglyLinkedList.Test.run();
//        DoublyLinkedList.Test.run();
//        Stack.Test.run();
//        Queue.Test.run();

        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {
            if (arr[lo+1] > arr[lo]) {
                lo++;
            } else if (arr[hi-1] > arr[hi]) {
                hi--;
            } else {
                break;
            }
        }

        return (hi - lo) * (Math.min(arr[lo], arr[hi]));
    }
}