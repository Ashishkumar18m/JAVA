/*  Write a Java program to allow the user to input the amount of deposit, 
yearly interest rate (percentage), and income tax(percentage). Then the 
program will calculate the amount of interest that the person earns in the 
year. See the example output below: The amount of deposit: 1000 Yearly 
interest rate: 7.5% Income tax rate: 4% The amount of interest earned in 
the year: 71.0.
 */
package JAVA.Lab_1;

import java.util.Scanner;

public class Q06 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of deposit,yearly interest rate (percentage), and income tax(percentage) :");
        float amount = s.nextFloat();
        float interest = s.nextFloat();
        float income_tax = s.nextFloat();
        float net_interest = amount * ((interest / 100) * (1 - (income_tax / 100)));
        System.out.print("Net Interest Earned:"+String.format("%.2f", net_interest));

    }
}
