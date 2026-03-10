package Executor.Challange_2;

public class SleepTask implements Runnable {
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.println("Started with " + current.getName() + " and is running");
        try {
            Thread.sleep(getRandomNumber() * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(current.getName() + " was interrupted");
            return;
        }
        System.out.println("Ended with " + current.getName() + " and is running");

    }

    private int getRandomNumber() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}
