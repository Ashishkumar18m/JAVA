/*25) Write a program to check if a string is a palindrome or not. 
 */
package JAVA.Lab_4;

import java.util.Scanner;

public class Q25 {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Remove spaces and convert to lowercase for uniform comparison
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
