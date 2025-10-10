package Strings;

public class BuiltInMethods {
    public static void main(String[] args) {
        String str = "Ritesh Kumar";
    int index = str.indexOf('R');  // index is always starting from 0.
        System.out.println("Index of string is : "+(index+1));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String s = "harshita";
        System.out.println(s.contains("harsh"));

        System.out.println(s.startsWith("harsh"));
        System.out.println(s.endsWith("k"));
    }
}
