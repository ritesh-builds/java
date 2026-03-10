package MultiThreading.ThreadClass.Synchronization;

public class TestingSynchronise {
    public static void main(String[] args) {
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);
        long startTime = System.currentTimeMillis();
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e){
            System.out.println("Interrupted "+e.getMessage());
        }
        try {
            t2.join();
        } catch (InterruptedException e){
            System.out.println("Interrupted "+e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Final counter value: %d and time taken: %d", counter.getCount(), (endTime-startTime) );
    }
}
