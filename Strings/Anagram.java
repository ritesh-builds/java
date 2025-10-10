//   What are anagrams ?
// They are nothing but are jumble words.
package Strings;
import java.util.*;
public class Anagram {
    public static int areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return -1;
            char [] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return -1;
        }
        return 1;
     }
    public static void main(String[] args) {
        int ans = areAnagrams("care","acer");
        if(ans == -1) System.out.println("Not anagrams of each other.");
        else System.out.println("Are anagrams of each other.");
    }
}
