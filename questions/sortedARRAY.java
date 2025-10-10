package questions;

public class sortedARRAY {
    public static void main(String[] args) {
        int count0 = 0;
        int count1 = 0;

        int[] arr = {1,0,1,1,1,0,0,0,0};
        System.out.println("Original Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
            if(arr[i] == 0){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }
        }
        System.out.println();

        // Pehle count0 elements 0
        for(int i = 0; i < count0; i++){
            arr[i] = 0;
        }
        // Baaki sab 1
        for(int i = count0; i < arr.length; i++){
            arr[i] = 1;
        }

        System.out.println("Sorted Array (0's first, then 1's):");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

