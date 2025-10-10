package Array;
import java.util.Scanner;
public class sortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean isSorted = true;
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" Element "+ i + ": ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            if(arr[i] < arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("SORTED");
        }else{
            System.out.println("NOT SORTED");
        }
    }
}
