/* Write a java program that converts the total number of seconds to hours,
minutes, and seconds. It should (1) prompt the user for input, (2) read an 
integer from the keyboard, (3)cSalculate the result, and (4) use println()
to display the output. For example, "5000 seconds = 1 hour, 23 minutes, 
and 20 seconds".  Hint: Use the modulus operator.
 */
package JAVA.Lab_1;

import java.util.Scanner;

public class Q05 {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int x = s.nextInt();

        int hour = x / 3600;
        
        int rem = x % 3600;
        int min = rem / 60;
        int sec = rem % 60;

        System.out.print(hour + "hour(s) " + min + "minute(s) " + sec + "second(s)");

    }
}
