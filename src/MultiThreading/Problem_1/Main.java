package MultiThreading.Problem_1;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        HelloThread thread1 = new HelloThread(1);
        HelloThread thread2 = new HelloThread(2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
