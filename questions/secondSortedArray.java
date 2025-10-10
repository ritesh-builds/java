package questions;
import java.util.Scanner;
public class secondSortedArray {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        printArray(arr);
        System.out.print("Sorted array: \n");
        int zeroes = 0;
        int ones = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroes++;
            } else if (arr[i] == 1) {
                ones++;
            }
        }
        for(int i = 0; i < arr.length; i++ ){
            if(i < zeroes){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        printArray(arr);
    }
}
