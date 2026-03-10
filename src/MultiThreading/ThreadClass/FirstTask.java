package MultiThreading.ThreadClass;

public class FirstTask extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i+" * ");
        }
        System.out.println("\nTask Complete...");
    }
}
