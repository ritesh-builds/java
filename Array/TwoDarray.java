package Array;
import java.util.Scanner;
public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row of ARRAY: ");
        int row = sc.nextInt();
        System.out.print("Enter the col of an ARRAY: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

       for(int i = 0; i < (row ); i++){
           for(int j = 0; j < (col ); j++){
               System.out.print("Enter the value of arr " +(i)+ " " +(j)+ ": ");
               arr[i][j] = sc.nextInt();
           }
       }
       int sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print( arr[i][j]+ " ");
                sum = sum + arr[i][j];
            }
        }
        System.out.println();
        System.out.println("The sum of array is: " +sum);
    }
}
