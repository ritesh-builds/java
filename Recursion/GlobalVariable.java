package Recursion;

public class GlobalVariable {
    public static void change(int x){
        x = 20;
    }
    public static void main(String[] args) {
        System.out.println(a);
        int x = 10;
        change(x);
        int a = 42; // a local variable aur isi wajah se local waala a print hua hai.
        System.out.println(x);
        System.out.println(a);
    }
    static int a = 7;   // a global variable.
}
