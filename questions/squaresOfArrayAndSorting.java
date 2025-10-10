package questions;
import java.util.Scanner;
public class squaresOfArrayAndSorting {
    static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static void squareArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
    }
    static void sortArray(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
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
        // sort array.
        System.out.println("Sorted array: ");
        sortArray(arr);
        printArray(arr);
        // square of array.
        squareArray(arr);
        System.out.println("Square of array is: ");
        printArray(arr);
        // sorting of squared array.
      sortArray(arr);
        System.out.println("Sorted squared array: ");
      printArray(arr);
    }
}
