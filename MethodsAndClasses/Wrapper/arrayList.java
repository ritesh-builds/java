package MethodsAndClasses.Wrapper;
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
  public static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;
        while(i < j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(77);
        list.add(60);
        list.add(45);
        list.add(22);
        list.add(90);
        list.add(100);
        System.out.println("Original array: "+ list);
//       reverseList(list);
        Collections.reverse(list);
        System.out.println("Reverse list: "+list);

        // sorting of array.
        Collections.sort(list);
        System.out.println( "Ascending order: " +list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order: "+list);
        System.out.println();
        System.out.println("List of Strings: \n");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Ritesh");
        strings.add("Sakshi");
        strings.add("Dhani");
        strings.add("Deepanshi");
        strings.add("Ritansh");
        strings.add("Aman");
        strings.add("Viksit");
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println("Sorted list of strings: "  +strings);

    }
}
