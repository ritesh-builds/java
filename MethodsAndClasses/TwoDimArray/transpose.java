package MethodsAndClasses.TwoDimArray;
import java.util.Scanner;
public class transpose {
    static void print(int[][] arr1 ,int r1, int c1){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
    }
    static void transpose(int[][] arr, int r , int c){
        if(r != c){
            System.out.println("error input - not compatible ith code! ");
            return;
        }
          int[][] trans = new int[r][c];
          for(int i = 0; i < arr.length; i++){
              for( int j = 0; j < c; j++){
                  trans[i][j] = arr[j][i];
              }
          }
        System.out.println("Transpose of a matrix is: ");
//          print(trans, r,c);
    }
    static void transposeSwap(int[][] arr, int r, int c){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i + 1; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose of matrix is: ");
        print(arr, r ,c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ///  input of matrix 1.
        System.out.print("Enter the row1: ");
        int row1 = sc.nextInt();
        System.out.print("Enter the col1: ");
        int col1 = sc.nextInt();
        System.out.println("enter the elements of matrix1.");
        int[][] arr1 = new int[row1][col1];
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given matrix is: ");
        print(arr1,row1,col1);
//      transpose(arr1, row1, col1);
        transposeSwap(arr1, row1,col1);
//      print(arr1, row1,col1);

    }
}
