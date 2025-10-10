package Strings;

public class passingStringToMethod {
    // Pass by refrence.
    static void change(int x){
        x = 100;
    }
// Pass by refrence.
    static void string(String str){
        str = "Sakshi";
    }

    public static void main(String[] args) {
        // Cannot change the value of string.
        String str = "Ritesh Kumar";
        System.out.println(str);
// Cannot change the value of an integer.
        int x = 10;
        change(x);
        System.out.println(x);
    }
}
