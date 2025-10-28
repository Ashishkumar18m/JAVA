/* Write a java program to print the factorial of the numbers from 1 to 10. 
To calculate the factorial value, use the while loop.
  */
package JAVA.Lab_3;

public class Q12 {
    public static void main(String args[]) {
         int num = 1;

        while (num <= 10) {
            int fact = 1;
            int i = 1;

            while (i <= num) {
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial of " + num + " = " + fact);
            num++;
        }
    }
}
