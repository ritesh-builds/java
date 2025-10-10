package questions;
import java.util.Scanner;
public class prefixRealSum {
    static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static int[] prefix(int[] arr){
        int n = arr.length;
         int[] pref = new int[n];
         pref[0] = arr[0];
         for(int i = 1; i < n; i++){
             pref[i] = pref[i - 1] + arr[i];
         }
         return pref;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        // array input.
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        printArray(arr);

           int[] pref = prefix(arr);
           printArray(pref);
    }
}
