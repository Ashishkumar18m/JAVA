/*24) Write a java program to perform the following string operations on strings – 
check strings for equality, reverse the string, change the case of a string, trim a string, etc.).*/
package JAVA.Lab_4;

import java.util.Scanner;

public class Q24 {
    public static void main(String args[]) {
     
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n--- String Operations ---");

        // 1. Check equality
        if (str1.equals(str2))
            System.out.println("Strings are equal.");
        else
            System.out.println("Strings are not equal.");

        // 2. Check equality ignoring case
        if (str1.equalsIgnoreCase(str2))
            System.out.println("Strings are equal (ignoring case).");
        else
            System.out.println("Strings are not equal (ignoring case).");

        // 3. Reverse a string
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed first string: " + reversed);

        // 4. Change case
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 5. Trim spaces
        String trimmed = str1.trim();
        System.out.println("Trimmed string: \"" + trimmed + "\"");

       
    }
}
