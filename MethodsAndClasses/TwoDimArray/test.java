package MethodsAndClasses.TwoDimArray;
import java.util.Scanner;
public class test {
    static void printMatrix(int[][] arr, int r, int c){
        for(int i = 0; i < arr.length; i++){
            for(int  j = 0; j < c; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void spiral(int arr[][], int r, int c){
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the col: ");
        int col = sc.nextInt();
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        int[][] arr = new int[col][row];
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printMatrix(arr, row,col);
    }
}
