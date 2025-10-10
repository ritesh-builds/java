package Array;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        System.out.print("Enter the size of an ARRAY: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] ages = new int[size];
///  for loop
for (int i = 0; i < ages.length; i++){
    System.out.print("Enter the value of arr "+i +": ");
    ages[i] = sc.nextInt();
}
      for(int i = 0; i <ages.length; i++){
          System.out.println("Element with index number " +i +" = " +ages[i]);
      }
///  for each loop
      for(int arr : ages ){
          System.out.println(arr);
      }
    }
}
