package Executor.Challange_3;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer>{
    private final int number;

    public Factorial(int number){
        this.number = number;
    }
    
    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if(number <= 1){
            return number;
        }  int fact = 1;
            for (int i = 1; i < number; i++) {
                fact = fact * i;
            }
        return fact;
    }

}
