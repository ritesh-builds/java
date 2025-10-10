package Recursion;
import java.util.Scanner;
public class RecursionArray {
    public static void recArr(int[] arr,int idx){
        if(idx == arr.length) return;
        System.out.print(" " +arr[idx]);
        recArr(arr,idx+1);
    }
    public static boolean exists(int[] arr, int target,int idx){
        if(idx == arr.length) return false;
       if(arr[idx] == target) return true;
       return exists(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int idx = sc.nextInt();
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the size of an Array:  ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i< arr.length; i++){
            System.out.print("Enter the element: " +i+ ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array printed through the help of recursion: ");
        recArr(arr,idx);
        System.out.println();
        System.out.print("Enter the number you wants to search: ");
        int target = sc.nextInt();
        System.out.println(exists(arr,target,0));
        boolean flag = exists(arr,target,0);

        if(flag == true) System.out.println("The element " +target+ " is present in the array.");
        else System.out.println("The element is not present in the array.");
    }
}
