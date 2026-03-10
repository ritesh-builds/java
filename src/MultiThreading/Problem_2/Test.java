package MultiThreading.Problem_2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("\nCreated the thread %s... ",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nThread finished %s... ",t1.getState());
    }
}
