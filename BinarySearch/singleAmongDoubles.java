package BinarySearch;
import java.util.*;
public class singleAmongDoubles {
    static void print(int[] arr){
        System.out.println("Array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int single(int[] arr){
        int n = arr.length;
        if(arr.length == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[0];
        int hi = arr.length-1, lo = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] != arr[mid+1] && arr[mid]!= arr[mid -1]) return arr[mid];
            int f = mid, s = mid;
            if(arr[mid] == arr[mid-1]) {
                f = mid -1;
            }
            else{ // arr[mid] == arr[mid + 1]
                 s = mid + 1;
            }
            int leftCount = f - lo;
            int rightCount = hi - s;
            if(leftCount % 2 != 0) lo = s+1;
            else hi = f -1;
        }
        return 7;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        print(arr);
        // Call the single() function and print result
        int singleElement = single(arr);
        System.out.println("Single element among doubles is: " + singleElement);
    }
}

