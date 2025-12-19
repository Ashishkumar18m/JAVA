/*31) Write a java program to demonstrate try, catch, finally clause.*/
package JAVA.Lab_7;

public class Q31 {
    public static void main(String[] args) {

        int[] numbers = {10, 0, 5};
        int result;

        for (int i = 0; i < numbers.length; i++) {
            try {
                // This may cause ArithmeticException when dividing by zero
                result = 100 / numbers[i];
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Caught an exception: " + e);
            } finally {
                // Always executed
                System.out.println("Finally block executed for i = " + i + "\n");
            }
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
