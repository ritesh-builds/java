package MultiThreading.Problem_1;

public class HelloThread extends Thread {

    private final int threadNumber;

    public HelloThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
       for (int i = 1; i <= 10; i++) {
            System.out.printf("\n(%d) Hello from thread-%d (%s) (%s) " ,i, threadNumber,getName(),Thread.currentThread().getName());
       }
    }

}
