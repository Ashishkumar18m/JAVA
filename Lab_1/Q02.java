package JAVA.Lab_1;

import java.util.Scanner;

public class Q02 {
     public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius :");
        float cel = s.nextFloat();
        float fah = (cel * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit:" + fah);

    }
}
