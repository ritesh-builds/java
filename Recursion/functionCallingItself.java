package Recursion;
import java.util.Scanner;
public class functionCallingItself {
    public static void Table(int n){
        if(n == 11) return;
        System.out.println( "2"+" X " +n+" = "+n*2);
        Table(n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        Table(n);
    }
}
