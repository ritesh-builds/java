package BinarySearch;
import java.util.*;
public class squareRoot {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int lo = 1, hi = x;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(mid>(x)/mid) hi=mid-1;
            else if(mid<(x)) {
                lo=mid+1;
            }else if(mid == (x)/mid) return mid;
        }
        return hi;
    }

    public static void main(String[] args) {

    }
 }
