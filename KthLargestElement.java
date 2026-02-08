package HEAPS;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int kthLargest(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int ele: arr){
            heap.add(ele);
            if(heap.size()>k) heap.remove();
        }
        return heap.peek();
    }
}
