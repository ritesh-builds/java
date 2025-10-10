package Strings;

public class subStrings {
    public static void main(String[] args) {
        String s = "Ritesh";
        for(int i = 0; i <= s.length();i++){
            for(int j = i+1; j < s.length();j++){
                System.out.print(s.substring(i,(j+1))+" ");
            }
            System.out.println();
        }
    }
}
