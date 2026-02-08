package Maps_and_Sets;

import java.util.HashMap;

public class a_isSubsetof_b {
    public static boolean isSubset(int[] a, int[] b) {
        HashMap<Integer, Integer> aMap = new HashMap<>();
        HashMap<Integer, Integer> bMap = new HashMap<>();

        for(int ele: a){
            if(aMap.containsKey(ele)){
                int freq = aMap.get(ele);
                aMap.put(ele,freq+1);
            }
            else aMap.put(ele,1);
        }
        for(int ele: b){
            if(bMap.containsKey(ele)){
                int freq = bMap.get(ele);
                bMap.put(ele,freq+1);
            }
            else bMap.put(ele,1);
        }
        for(int ele: bMap.keySet()){
            int aFreq = aMap.get(ele);
            int bFreq = bMap.get(ele);
            if(aFreq != bFreq){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a,b));
    }
}
