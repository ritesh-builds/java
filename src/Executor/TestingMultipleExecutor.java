package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import MultiThreading.ThreadClass.Runnable.PrintTask;

public class TestingMultipleExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
           PrintTask task = new PrintTask((char)i);
            service.submit(task);
        }

        service.shutdown();
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
          service.shutdownNow();
        }
    }
}
