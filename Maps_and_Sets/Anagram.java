package Maps_and_Sets;

import java.util.HashMap;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(!map1.containsKey(ch)) return false;
            int freq = map1.get(ch);
            if(freq == 0) return false;
            map1.put(ch, freq-1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("Ritesh","Rtiseh"));
    }
}
