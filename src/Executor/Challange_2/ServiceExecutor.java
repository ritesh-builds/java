package Executor.Challange_2;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ServiceExecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Threads for tasks to complete:");
        int numThreads = sc.nextInt();
       try (ExecutorService service = Executors.newFixedThreadPool(numThreads)) {
           for (int i = 1; i <= 10; i++) {
               SleepTask task = new SleepTask();
               service.submit(task);
           }
           service.shutdown();
           if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
               System.out.println("Timed out...");
               System.out.println("EMERGENCY SHUTDOWN");
                service.shutdownNow();
           }
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
    }

}
