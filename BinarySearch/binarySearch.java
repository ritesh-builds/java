package BinarySearch;
import java.lang.reflect.Array;
import java.util.*;
public class binarySearch {
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
     public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start+(end - start)/2;
            if(arr[mid] > target)  end = mid -1;
            else if (arr[mid] < target)  start = mid + 1;
            else if(arr[mid] == target) return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the element to find in array: ");
        int target = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        print(arr);
        Arrays.sort(arr);
        int index = binarySearch(arr, target);
        if(index != -1)
            System.out.println("Element FOUND at index: " + (index+1));
        else
            System.out.println("Not FOUND!");
    }
}
