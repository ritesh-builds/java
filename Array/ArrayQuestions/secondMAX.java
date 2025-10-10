package Array.ArrayQuestions;
import java.util.Scanner;
public class secondMAX {
    static int findMax(int[] arr){
         int max = Integer.MIN_VALUE;
         for(int i = 0; i < arr.length; i++){
           if(arr[i] > max){
                max = arr[i] ;
           }
         }
        System.out.print("Maximum value of element in array is: " +max);
        System.out.println();
         return max;
    }
    static int secMax(int[] arr){
        int max = findMax(arr);
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
           if(arr[i] != max && arr[i] > secondMax){
               secondMax = arr[i];
           }
        }
        System.out.println("The second maximum element in array is: " +secondMax);
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        findMax(arr);
        secMax(arr);
    }
}
