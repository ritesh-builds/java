package BinarySearch;
import java.util.*;
public class OccuranceOfElement {
    public static int searchOccurance(int[] arr, int target){
       int low = 0, high = arr.length-1, index = -1;
       while(low <= high){
           int mid = low+(high-low)/2;
           if(arr[mid] < target) low = mid+1;
           else if (arr[mid] > target) high = mid-1;
           else return index = mid;
       }
        return index;
    }
}
