package MethodsAndClasses.recursion;
import java.util.*;
public class digitSum {
   static int SOD(int n){
        // base case.
       if(n >= 0 && n <= 9){
           return n;
       }
       // smaller problem.  Recursive wor -> smaller answer calculate karna hai.
      int smallAns = SOD(n / 10);
      return smallAns + (n%10);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        System.out.println(SOD(n));
    }
}
