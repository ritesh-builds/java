package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class copyArray {
    static void printArray(int[] arr){
   for(int i = 0; i < arr.length; i++){
       System.out.print(arr[i] +" ");
   }
        System.out.println();
    }
    public static void main(String[] args) {
       int[] arr = new int[5];
       arr[0] = 10;
       arr[1] = 20;
       arr[2] = 30;
       arr[3] = 40;
       arr[4] = 50;

        System.out.print("The ORIGINAl array is: " );
        printArray(arr);

        int[] brr = Arrays.copyOf(arr , arr.length);
        System.out.print("COPIED array is: ");
        printArray(brr);


        arr[0] = 1;
        arr[1] = 33;

        System.out.print("COPIED array AFTER Change the value: ");
        printArray(brr);

        System.out.print("ORIGINAl array AFTER Change the value: ");
        printArray(arr);

        int[] crr = arr.clone();
        System.out.print("Clone of arr: ");
        printArray(crr);
    }
}
