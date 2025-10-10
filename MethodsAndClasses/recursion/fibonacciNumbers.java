package MethodsAndClasses.recursion;
import java.util.*;
public class fibonacciNumbers {
static int fibonacci(int n){
    // base case.
    if(n == 0 || n == 1){
        return n;
    }
    // smaller problem.
    int prev = fibonacci(n - 1);
    int prevPrev = fibonacci(n - 2);
// self work.
    return prev + prevPrev;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
       int n = sc.nextInt();
       for(int i = 0; i < n; i++){
           System.out.println(fibonacci(i));
       }
    }
}
