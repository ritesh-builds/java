package Recursion;

public class Reverse {
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10,(r*10)+n%10);
    }
    public static void main(String[] args) {
        int n = 1234;
        int r = 0;
//     while(n != 0){
//         r *= 10;
//         r += (n%10);
//         n /= 10;
//     }
        System.out.println(r);
    }
}
