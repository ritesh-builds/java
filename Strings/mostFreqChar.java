package Strings;

public class mostFreqChar {
    public static char freqChar(String s){
        int n = s.length();
        int maxFreq = -1;
        char ans  = s.charAt(0);
        for(int i = 0; i < n; i++){
            int freq = 1;
            char ch = s.charAt(i);
            for(int j = 0; j < n; j++){
                if(s.charAt(i) == ch)  freq++;
            }
            if(freq > maxFreq){
                maxFreq = freq;
                ans = ch;
            } else if (freq == maxFreq && ch < ans) {
                ans = ch;
            }
        }return ans;

    }

}
