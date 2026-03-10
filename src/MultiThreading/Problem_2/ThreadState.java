package MultiThreading.Problem_2;

public class ThreadState extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.printf("\nFrom inside run %s ",Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted...");
            throw new RuntimeException(e);
        }
    }
    
}
