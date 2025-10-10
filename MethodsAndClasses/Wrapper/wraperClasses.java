package MethodsAndClasses.Wrapper;
import java.util.ArrayList;
public class wraperClasses {
    public static void main(String[] args) {
        //  Wraper clases.
        Integer p = Integer.valueOf(2);
        System.out.println(p);

        Float f = Float.valueOf(3);
        System.out.println(f);

        ArrayList<Integer> L1 = new ArrayList<>();   // ArrayList for Integers.
        ArrayList<Boolean> L2 = new ArrayList<>();   // ArrayList for Boolean.
        ArrayList<Float> L3 = new ArrayList<>();   // ArrayList for Float.
        // Add new element.
        L1.add(5);
        L1.add(6);
        L1.add(7);
        L1.add(8);
        // gat an element at the index i.
        System.out.println(L1.get(0));
        System.out.println(L1.get(1));
        System.out.println(L1.get(2));
        System.out.println(L1.get(3));
        // print with for loop;
        for(int i = 0; i < L1.size(); i++){
            System.out.print(L1.get(i)+ " ");
        }
        System.out.println();
        // printing the array list directly.
        System.out.println(L1);

        // add the element in array at index i.
        L1.add(1,10);
        System.out.println(L1);
        // remove the element in array at index i.
        L1.remove(1 );
        System.out.println(L1);

        // removing an element e.
        L1.remove(Integer.valueOf(8));
        System.out.println(L1);
        // checking if an element exists?
        boolean ans = L1.contains(Integer.valueOf(6));
        System.out.println(ans);
    }
}
