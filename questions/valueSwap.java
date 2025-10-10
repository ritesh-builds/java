package questions;

public class valueSwap {
    ///  This methof swap numbers.
    static void reverse(int a, int b){
        System.out.println("Values of a and b before swap: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp = a;
         a = b;
         b = temp;
        System.out.println("Values of a and b after swap: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
    // This method swap the array.
    static void arraySwap(int[] arr){
        System.out.println("Array BEFORE reverse: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Array AFTER reverse: ");
        int[] brr = arr.clone();
        for(int i = arr.length - 1; i >= 0; i-- ){
            System.out.print(brr[i]+ " ");
        }
    }
    public static void main(String[] args) {
   int a = 9;
   int b = 10;
        reverse(a , b);

        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        arraySwap(arr);
    }
}
