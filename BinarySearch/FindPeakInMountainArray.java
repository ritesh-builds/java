package BinarySearch;

public class FindPeakInMountainArray {
    static void print(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static int mountain(int[] arr){
        int low = 1, high = arr.length-2, index = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] > arr[mid+1] && arr[mid]<arr[mid-1]) return mid;
            else if(arr[mid] >arr[mid-1] && arr[mid]<arr[mid+1]) low = mid+1;
            else high = mid-1;
        }
        return 123456;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.print("Original array: ");
        print(arr);


    }
}
