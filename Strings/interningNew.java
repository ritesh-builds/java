package Strings;

public class interningNew {
    static boolean compare(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
//            String s1 = "ritesh ";
//            s1 += "kumar";
//        System.out.println(s1);

//        String s = "Guddu";
//        String t = "Guddu";
//        String a = new String("Guddu");
//        System.out.println(a);
        // immutability of String.
        // Strings are immutable in java due to security purposes.
//        String k = "Sakshi";
//        k = k.substring(0,2)+ 'm' + k.substring(4);
//        System.out.println(k);

        // s1.equals(s2)
//
//        String s2 = "Ritesh";
//        String s3 = new String("Ritesh");
//        System.out.println(s2==s3);
//        System.out.println(s2.charAt(0) == s3.charAt(0));

        System.out.println(compare("Ritesh", "Kumar"));
        System.out.println( compare("Ritesh","Ritesh"));

    }
}
