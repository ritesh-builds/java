package Array.ArrayQuestions;

import java.util.Scanner;

public class triplePair {
    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
              for(int k = j + 1; k < n; k++){
                  if(arr[i] + arr[j] + arr[k] == target){
                      ans++;
                  }
              }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an ARRAY: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the value of target: ");
        int target = sc.nextInt();
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arr.length; i++){
//            System.out.print("Enter element "+i+ ": ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i]+ " ");
            System.out.println();
        }
        System.out.println( "The triplet pair is: " +pairSum(arr,target));
    }
}
