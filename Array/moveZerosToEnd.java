package Array;
import java.util.Scanner;
public class moveZerosToEnd {
      static void printArray(int[] arr){
          for(int i = 0; i < arr.length; i++){
              System.out.print(arr[i]+ " ");
          }
          System.out.println();
      }
    static void zeros(int[] arr){
          for(int i = 0; i < arr.length - 1; i++){
              for(int j = i + 1; j < arr.length; j++){
                  if(arr[i] == 0){
                      int temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                  }
              }
          }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the element "+i+ ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);
        System.out.println("Array where zeroes are on right side: ");
        zeros(arr);
        printArray(arr);
    }
}
