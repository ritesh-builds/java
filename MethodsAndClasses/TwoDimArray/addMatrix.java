package MethodsAndClasses.TwoDimArray;
import java.util.Scanner;
public class addMatrix {

    static void print(int[][] arr1 ,int r1, int c1, int r2, int c2){
        System.out.println("After add (matrix1 + matrix2) sum  is: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
    }
   static void add(int[][] arr1,int[][] arr2 , int r1, int c1, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong input - Addition of matrices not possible! ");
            return;
        }
int[][] sum = new int[r1][c1];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
       print(sum, r1, c1, r2, c2);
  }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ///  input of matrix 1.
        System.out.print("Enter the row1:  ");
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
// input of matrix 2.
        System.out.print("Enter the row2:  ");
        int row2 = sc.nextInt();
        System.out.print("Enter the col2: ");
        int col2 = sc.nextInt();
        System.out.println("Enter the elements of matrix2.");
        int[][] arr2 = new int[row2][col2];
        for(int i = 0; i < row2; i++){
            for(int j = 0; j < col2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        add(arr1, arr2,row1,col1,row2,col2 );
    }
}
