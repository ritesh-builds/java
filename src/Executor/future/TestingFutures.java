package Executor.future;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        FetchName task1 =  new FetchName("Jiya");
        FetchName task2 =  new FetchName("Ishika");
        FetchName task3 =  new FetchName("Diyva");
        FetchName task4 =  new FetchName("Khushi");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\nFull name is %s ", name1.get());
        System.out.printf("\nFull name is %s ", name2.get());
        System.out.printf("\nFull name is %s ", name3.get());
        System.out.printf("\nFull name is %s ", name4.get());

        service.shutdown();
    }
}
