/* Write a java program to find all prime numbers from 1 to N. */
package JAVA.Lab_3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Q16 {
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int i = s.nextInt();

        for (int j = 2; j <= i; j++) {
            boolean isprime = true;
            for (int k = 2; k <= sqrt(j); k++) {
                if (j % k == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(j + " ");
            }

        }
    }
    
}
