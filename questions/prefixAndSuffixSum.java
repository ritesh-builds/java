package questions;
import java.util.Scanner;
public class prefixAndSuffixSum {
    static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static void prefix_Sum(int[] arr, int index){
        int sum = 0;
        for(int i = 0; i< index; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    static void suffixSum(int[] arr, int index){
         int   sum = 0;
        for(int i = arr.length - 1; i > index; i--){
            sum += arr[i];
        }
        System.out.println(sum);
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
        // prefix sum of an array.
        System.out.print("Enter the index1 and index1 < arr.length: ");
        int index1 = sc.nextInt();
        System.out.print("Sum of prefix elements of an array: ");
        prefix_Sum(arr, index1);
        // suffix of an array.
        System.out.print("Enter the index for suffix sum (0 to " + (arr.length - 1) + "): ");
        int index2 = sc.nextInt();
        System.out.print("Sum of suffix elements of an array: ");
        suffixSum(arr,index2);
    }
}
