package Executor.Challange_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorial {
   public static void main(String[] args) {
       try ( ExecutorService service = Executors.newFixedThreadPool(3)){
           List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Factorial task = new Factorial(i);
                list.add(service.submit(task));
            }

            for(Future<Integer> future : list){
                System.out.printf("\nResult is: %d",future.get());
            }

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("\nAll tasks terminated...");
                System.out.println("EMERGENCY SHUTDOWN");
                service.shutdownNow();
            }
       } catch (ExecutionException | InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
}
