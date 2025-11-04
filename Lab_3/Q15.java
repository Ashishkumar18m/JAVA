/* Write a java program to check if a number is prime or not.*/
package JAVA.Lab_3;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Q15 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int i = s.nextInt();
        boolean isprime = true;
        if (i <= 1) {
            isprime = false;

        } else {
            for (int j = 2; j <= sqrt(i); j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime == true) {
            System.out.print(i + " is a prime number.");
        } else {
            System.out.print(i + " is not a prime number.");
        }

    }
}
