package ExceptionHandeling.Calculator;

import java.util.Scanner;

public class TryCatch {
    public void printName(String name) throws IllegalArgumentException {
        if(name.contains("-")){
            throw new IllegalArgumentException();
        }
        System.out.println(name);
    }
    public static void main(String[] args) {
        a();
    }
    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){
              Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to division calculator:\n");
        System.out.print("Enter the first number: ");
        double first = sc.nextInt();
        System.out.print("Enter the second number: ");
        double second = sc.nextInt();

        try {
            int[] arr = new int[5];
            double ans  = first / second;
//          arr[7] = first;
            System.out.println("The ans is: "+ans);
        }
        catch (ArithmeticException | NumberFormatException e) {
            System.out.printf("Error: %s", e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array Index Out Of Bounds..."   );
        }
        catch(Throwable th){
            System.out.println("Error: "+th.getMessage());
            throw th;
        }
        finally {
            System.out.println("✅ Finally code chal gaya...");
        }
    }

}


