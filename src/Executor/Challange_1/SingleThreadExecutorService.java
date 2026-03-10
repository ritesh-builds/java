package Executor.Challange_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorService {
    static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            PrintNumbers task = new PrintNumbers();
            service.submit(task);
        }
    }

}
