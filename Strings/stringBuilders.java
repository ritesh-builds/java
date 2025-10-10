package Strings;

import java.util.ArrayList;

public class stringBuilders {
    public static void main(String[] args) {
//        ArrayList<Character> str = new ArrayList<>();
//        str.add('s');
//        str.set(0,'r');
        //  bro do not get confused because this an array also, but of characters.
          StringBuilder s = new StringBuilder("Ritesh");
        System.out.println(s.capacity()+" "+s.length());
        System.out.println(s);
        System.out.println( s.append(" Kumar"));
        s.setCharAt(1,'e');
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);
        s.append("khbhfsdhbfhjifoffj ojrsoifjoijoijoijoijofduov");
        System.out.println(s.capacity()+" "+s.length());
        s.append('t');
        System.out.println(s.capacity()+" "+s.length());
    }
}
