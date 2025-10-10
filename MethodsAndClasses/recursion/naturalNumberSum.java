package MethodsAndClasses.recursion;
import java.util.Scanner;
public class naturalNumberSum {
//    static void sum(int n){
//        int ans = 0;
//        for(int i = 0; i <= n; i++){
//            ans += i;
//        }
//        System.out.print( "Sum of 1st n natural number is: " +ans);
//
//    }
    static void printIncreasing(int n){
        // Base case.
        if(n == 1){
            System.out.print(n);
            return;
        }
        // Recursive work.
        printIncreasing(n - 1);
        // self work.
        System.out.print(" " +n);
    }

    static void printDecreasing(int n){
        // base case.
        if(n < 1){
            return;
        }
        //  self work.
        System.out.println(n);
        // Recursive work.
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        int sum = (n*(n + 1))/2;
        System.out.print( "Sum of 1st n natural number is: " +sum);
        System.out.println();

//        sum(n);

        printIncreasing(n);
        System.out.println();
        printDecreasing(n);
    }
}
