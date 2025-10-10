package BinarySearch;
public class justLessThanTarget {
    public static int findFloor(int[] arr,int x){
       int low = 0, high = arr.length-1, index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > x) {
                high = mid - 1;   // move left
            } else {
                index = mid;      // arr[mid] <= x, candidate for floor
                low = mid + 1;    // move right
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 12};
        int x = 5;
        int floorIndex = findFloor(arr, x);
        if (floorIndex != -1)
            System.out.println("Floor of " + x + " is " + arr[floorIndex]);
        else
            System.out.println("No floor exists for " + x);
    }
}
