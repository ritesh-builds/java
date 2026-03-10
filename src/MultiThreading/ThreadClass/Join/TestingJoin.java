package MultiThreading.ThreadClass.Join;

import MultiThreading.ThreadClass.Runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');


        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\nThread-1 Started...");
        Thread t2 = new Thread(p2);
        System.out.println("\nThread-2 Started...");
        t2.start();
        t1.join();
        Thread t3 = new Thread(p3);
        System.out.println("\nThread-3 Started...");
        t3.start();

        long endTime =  System.currentTimeMillis();
        System.out.printf("\nTotal time taken: %s",(endTime-startTime),Thread.currentThread().getName());

    }
}
