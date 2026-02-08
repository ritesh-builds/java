package HEAPS;
import java.util.*;
public class PriorityQueueSTL {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(-30);
        pq.add(35);
        pq.add(5); pq.add(8); pq.add(2);pq.add(0);pq.add(3);pq.add(1);
        pq.add(7);pq.add(6);
        System.out.println(pq.peek());
        System.out.println(pq);
        for(int ele : pq){
            System.out.print(ele+" ");
        }
    }
}
