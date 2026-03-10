package MultiThreading.ThreadClass.Runnable;

public class PrintTask implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
                System.out.printf("%d%c ",i,targetCharecter);
            }
            System.out.printf("\n%s Task Complete...",Thread.currentThread().getName(),targetCharecter);
        }
    private final char targetCharecter;
    public PrintTask(char targetCharecter) {
        this.targetCharecter = targetCharecter;
    }
}
