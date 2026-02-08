package Maps_and_Sets;

import java.util.HashMap;

public class MostFrequentCharacter {
    public static char getMaxOccuringCharacter(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1);
            }
            else map.put(ch,1);
        }
        int maxFreq = 0;
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            if(freq>maxFreq){
                maxFreq = freq;
            }
        }
        char ans = s.charAt(0);
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            if(freq==maxFreq && ch>=ans){
                ans = ch;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(getMaxOccuringCharacter("Raghav"));
    }

}
