package mergeSort;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {1,8,4,5,3,5,2,5,7,12,9,0,2,3,7,5};
        mergeSort(arr);
        for(int ele: arr) System.out.print(ele+ " ");
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length) { // fixed condition
            if(a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        // Copy remaining elements
        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n <= 1) return;

        int mid = n/2;
        int[] a = new int[mid];
        int[] b = new int[n - mid];

        // Correct way to split array
        for(int i = 0; i < mid; i++) a[i] = arr[i];
        for(int i = mid; i < n; i++) b[i - mid] = arr[i];

        mergeSort(a);
        mergeSort(b);

        merge(a, b, arr);
    }
}

