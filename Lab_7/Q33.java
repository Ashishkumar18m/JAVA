/*33) Write a java program to create a user-defined exception for pay out of bound.
*/
package JAVA.Lab_7;

// User-defined exception
class PayOutOfBoundException extends Exception {
    PayOutOfBoundException(String msg) {
        super(msg);
    }
}
public class Q33 {
     static void checkPay(double pay) throws PayOutOfBoundException {

        if (pay < 5000 || pay > 50000) {
            throw new PayOutOfBoundException("Pay out of bound! (Allowed: 5000 to 50000)");
        } else {
            System.out.println("Pay is within limit: " + pay);
        }
    }

    public static void main(String[] args) {

        double pay1 = 3000;   // Out of bound
        double pay2 = 20000;  // Valid

        try {
            checkPay(pay1);
        } catch (PayOutOfBoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            checkPay(pay2);
        } catch (PayOutOfBoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}