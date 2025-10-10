// time complexity of merge sort is O(nlogn)
package mergeSort;
import java.util.Scanner;
public class mergeArray {

    public static void merge(int[] a, int[] b,int[] c){
        int i = 0, j = 0, k = 0;
        while(a.length <= b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element "+ i+ ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of an array2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element "+ i+ ": ");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[size1+size2];
         System.out.println("Array1: ");
        print(arr1);
        System.out.println(("Array2: "));
        print(arr2);
//        merge(arr1,arr2,);
    }
}
