package JAVA.Lab_1;

import java.util.Scanner;

public class Q03 {
     public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers :");
        float a = s.nextFloat();
        float b = s.nextFloat();

        System.out.println("Before Swapping a,b : " + a + "," + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping a,b : " + a + "," + b);
        float temp = a;
        a = b;
        b = temp;
        System.out.println("After Again Swapping a,b : " + a + "," + b);
     } 
}
