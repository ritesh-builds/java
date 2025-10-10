package MethodsAndClasses.recursion;
import java.util.Scanner;
public class factorial {
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int ans = n * factorial(n - 1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println( factorial(n));
    }
}
