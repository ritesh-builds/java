package ExceptionHandeling;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to division calculator:\n");

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        try {
            int result = first / second;
            System.out.println("The result is: " + result);
        }
        catch (ArithmeticException e) {
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Division by zero occurred which is not allowed...");
            }
            else {
                throw e;
            }
        }
    }
}
