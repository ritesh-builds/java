package Array;

public class maximum {
    public static void main(String[] args) {
        int[] arr = {1,2,67,8,81,19,1,178,66};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
