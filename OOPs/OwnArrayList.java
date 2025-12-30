package OOPs;

import java.util.*;

class ArrayList{
    // User defined data structure.
    int[] arr;
    int idx = 0;
    int size = 0;
    ArrayList(int capacity){
        arr = new int[capacity];
    }

    int capacity(){
        return arr.length;
    }

    void add(int ele){
        if(idx == arr.length){ // array is full.
            int[] arr2 = new int[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[idx] = ele;
        size++;
        idx++;
    }
    void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    int get(int index){
        return arr[index];
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Capacity of Array: ");
        int n = sc.nextInt();
        ArrayList arr = new ArrayList(n);

        System.out.print("Capacity of Arraylist is : "+arr.capacity());
        System.out.println();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.print("Size of ArrayList is: "+arr.size);
        System.out.println();
        arr.display();
    }
}
