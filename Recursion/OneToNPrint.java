package Recursion;
import java.util.Scanner;
public class OneToNPrint {
    public static void print(int x, int n){
        if(x == 11) return;
        System.out.println( n +" X " +x+" = "+x*n);
        print(x+1,n);
        System.out.println( n +" X " +x+" = "+x*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        print(1,n);
    }
}
