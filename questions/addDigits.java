package questions;
import java.util.*;
public class addDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int add = 0;
        int mult=1;
        while(n > 0){
            add = add + n%10 ;
            mult *= n%10;
            n = n / 10;

        }

        System.out.println("Sum of digit of number n: " +add);
        System.out.println( "Product of number n: "+mult);
        System.out.println("difference is: " + (mult-add));


    }
    //
}
