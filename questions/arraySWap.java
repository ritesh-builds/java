package questions;

public class arraySWap {
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n - 3; i >= 0; i--){
              ans[j++] = arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void swapInArray(int[] arr, int i , int j){
        int temp = arr[i];
         arr[i] = arr[j];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
//        System.out.println("Array Before SWAP: ");
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(" "+arr[i]);
//        }
//        System.out.println();
//        System.out.println("Array After SWAP: ");
//         int[] ans = reverseArray(arr);
//         printArray(ans);
         int i = 0, j = arr.length;
         while(i < j){
             i++;
             j--;
         }

    }
}
