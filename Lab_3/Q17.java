/* Write a java program to print the first 50 Fibonacci numbers. */
package JAVA.Lab_3;

public class Q17 {
    public static void main(String args[]) {
        int n = 50;
        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long c = a + b;
            a = b;
            b = c;
        }

    }
    
}
