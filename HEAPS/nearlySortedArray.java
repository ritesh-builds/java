package HEAPS;

import java.util.PriorityQueue;

public class nearlySortedArray {
    public static void nearlySorted(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
            int idx = 0;
        for(int ele: arr){
            heap.add(ele);
            if(heap.size()>k) {
                int top = heap.remove();
                arr[idx] = top;
                idx++;
            }
        }
            while(heap.size() != 0){
                arr[idx] = heap.remove();
                idx++;
            }
    }
}
