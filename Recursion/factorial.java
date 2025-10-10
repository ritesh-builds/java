package Recursion;
import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        System.out.print( "Factorial of " + n+ " is: " +fact(n));
    }
}
