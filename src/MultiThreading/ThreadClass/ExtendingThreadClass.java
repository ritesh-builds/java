package MultiThreading.ThreadClass;

public class ExtendingThreadClass {
    public static void main(String[] args) {

        long startTime =  System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nFirst task started...\n");
        t1.start();
        System.out.println("\nSecond task started...\n");
        t2.start();
        System.out.println("\nThird task started...\n");
        t3.start();

        long endTime =  System.currentTimeMillis();
        System.out.printf("\nTotal time taken: %s",(endTime-startTime),Thread.currentThread().getName());
    }
}
