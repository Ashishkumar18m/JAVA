/*34) Write a java program to handle null pointer exception and use the “finally” block to display a message of the user.*/
package JAVA.Lab_7;

public class Q34 {
     public static void main(String[] args) {

        String str = null;   // This will cause NullPointerException

        try {
            System.out.println("Length of string: " + str.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        finally {
            System.out.println("This message always displays — End of program.");
        }
    }
}
