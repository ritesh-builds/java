package Recursion;
import java.util.Scanner;
public class Power {
    public static int pow(int a, int b){
        if(b == 0 ) return 1;
        else if(b == 1) return a;
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base a: ");
        int a = sc.nextInt();
        System.out.print("Enter the Exponent b: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to power "+b+" is: "+ pow(a,b));
    }
}
