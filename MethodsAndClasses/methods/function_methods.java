package MethodsAndClasses.methods;
import java.util.Scanner;
public class function_methods {
    public static void fact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int product = 1;
        for(int i = 1; i <= n; i++){
            product = product*i;
        }
        System.out.println(product);
    }
    public static void main(String[] args) {
        fact();
    }
}
