package Maps_and_Sets;

import java.util.HashMap;

public class pairs_counting_in_sets {
    public static int countPairs(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }
            else{
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
        }

        int pairs = 0;
        for(int ele: map.keySet()){
//          ele-s = k or s-ele = k  (s mean something)
            int rem1 = ele-k;
            int rem2 = ele+k;
            if(map.containsKey(rem1)) pairs += (map.get(ele)*map.get(rem1));
            if(map.containsKey(rem2)) pairs += (map.get(ele)*map.get(rem2));
        }
        pairs = pairs/2;
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1,77,9,28,35,2,99,5,3,9,0,89,1,1,1,1,-2,-2,4,4,4};
        System.out.println(countPairs(arr,3));
    }
}
