package Recursion;

import java.util.*;

public class arrayOfString {
    public static void arrList(ArrayList<String> list){
        list.add("Ritesh");
    }
    public static void main(String[] args) {
        String[] str = {"Ritesh", "Aditya", "Dev", "Aman"};
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+ " ");
        }
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        list.add("Shivani");
        list.add("Ishika");
        list.add("Himahshu");
        list.add("Rameshwar");

        System.out.println(list);
        arrList(list);
        System.out.println(list);
    }
}
