package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.print("q queue: "+q  );
        System.out.println();
        // rear -> 54321 <- front
        Queue<Integer> helper = new ArrayDeque<>();
        while(q.size() > 0){
            helper.add(q.remove());
        }
        System.out.print("Helper queue: "+helper);
        System.out.println();
        while(helper.size() > 0){
            q.add(helper.remove());
        }
        System.out.println("q queue Again!!: "+q);
    }
}
