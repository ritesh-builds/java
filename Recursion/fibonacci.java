package Recursion;
import java.util.Scanner;
public class fibonacci {
    public static int nthFibo(int n){
        if(n <= 1) return n;
        return nthFibo(n-1) + nthFibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        System.out.println( nthFibo(n));
    }
}
