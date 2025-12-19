/*32) Write a java program to demonstrate throw and throws clause.*/
package JAVA.Lab_7;
import java.util.Scanner;
class TestException {

    // Method that uses 'throws' to declare it may throw an exception
    void checkAge(int age) throws Exception {
        if (age < 18) {
            // Using 'throw' to actually throw an exception
            throw new Exception("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}
public class Q32 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestException obj = new TestException();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            obj.checkAge(age);  // May throw Exception
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Program finished execution.");
        }

        sc.close();
    }
}
