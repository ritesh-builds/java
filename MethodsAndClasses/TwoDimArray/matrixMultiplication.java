package MethodsAndClasses.TwoDimArray;
import java.util.Scanner;
public class matrixMultiplication {

    static void print(int[][] arr1 ,int r1, int c1, int r2, int c2){
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
    }
    static void multiply(int[][] arr1, int[][] arr2, int r1, int c1, int r2, int c2){
        if(c1 != r2){
            System.out.println("Order of matrix not compatible - multiplication not possible!");
            return;
        }
        int[][] mul = new int[r1][c1];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    /*
                    mul[i][j]
                   */
                    mul[i][j] += (arr1[i][k] * arr2[k][j]) ;

                }
            }
        }
        System.out.println("Multiplication of two matrices is: ");
        print(mul,r1,c1,r2,c2);
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
        multiply(arr1,arr2, row1,col1,row2,col2);
    }
}
