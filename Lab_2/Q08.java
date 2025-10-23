/* Write a Java program to calculate the revenue from a sale based on the unit 
price and quantity of a product input by the user. The discount rate is 10% for
the quantity purchased between 100 and 120 units, and 15% for the quantity 
purchased greater than 120 units. If the quantity purchased is less
than 100 units, the discount rate is 0%. See the example output as shown below:
Enter unit price: 25 
Enter quantity: 110 
The revenue from sale: 2475.0$ 
After discount: 275.0$(10.0%)*/
package JAVA.Lab_2;

import java.util.Scanner;

public class Q08 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter unit price:");
        int p = s.nextInt();
        System.out.print("Enter quantity:");
        int q = s.nextInt();
        float rev;
        if (q < 100) {
            rev = q * p;
            System.out.println("Discount:" + 0 + "%");
        } else if (q > 99 && q <= 120) {
            rev = ((q * p) - ((q * p) * (10 / 100f)));
            System.out.println("Discount:" + q * p * 0.10f + "$" + "(10.0%)");
        } else {
            rev = (q * p) - ((q * p) * (15 / 100f));
            System.out.println("Discount:" + q * p * 0.15f + "$" + "(15.0%)");
        }

        System.out.println("The Revenue from sale:" + rev + "$");
    }
}
