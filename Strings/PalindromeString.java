package Strings;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        str = str.toLowerCase(); // to ignore case differences
        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("This string is palindrome.");
        } else {
            System.out.println("This string is not a palindrome.");
        }
    }
}

