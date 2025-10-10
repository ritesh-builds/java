package MethodsAndClasses.methods;

public class twice {
    public static void makeTwice(int p){
        p = p*2;
        System.out.println(p);
    }
    public static void main(String[] args) {
        int p = 24;
        System.out.println(p);
        makeTwice(p);
    }
}
