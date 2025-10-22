//   Write a java program to find the area of a rectangle, Triangle, and Circle.
package JAVA.Lab_1;

import java.util.Scanner;

public class Q04 {
     public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a shape to calculate area:");
        System.out.print("1.Rectangle \n2.Triangle \n3.Circle\n");
        System.out.print("Enter your choice (1-3) : ");
        int i = s.nextInt();

        switch (i) {
            case 1:
                System.out.print("Enter length & Width : ");
                float l = s.nextFloat();
                float w = s.nextFloat();
                double a_r = l * w;
                System.out.print("Area of rectangle of length = " + l + " & width =" + w + " : " + a_r);
                break;
            case 2:
                System.out.print("Enter base & height : ");
                float b = s.nextFloat();
                float h = s.nextFloat();
                double a_t = 0.5 * b * h;
                System.out.print("Area of triangle of base = " + b + " & height =" + h + " : " + a_t);
                break;
            case 3:
                System.out.print("Enter radius : ");
                float r = s.nextFloat();
                double a_c = 3.14 * r * r;
                System.out.print("Area of circle of radius = " + r + " : " + a_c);
                break;
            default:
                System.out.print("Invalid Number.");

        }

    }
}
