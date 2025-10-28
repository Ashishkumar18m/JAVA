/* Write a java program that prints a menu on the screen as shown below and reads the option selected by the user. According to the option, the program must read the corresponding data to perform the selected area calculation. The resulting values must be printed on the screen. 
1.   Calculate the area of a triangle (base, height) 
2.   Calculate the area of a circle (r)
3.   Calculate the area of a rectangle (length, width)
4.   Exit the program*/
package JAVA.Lab_3;

import java.util.Scanner;

public class Q11 {public static void main(String args[]) {
        
        
        Scanner scanner = new Scanner(System.in);

        
            System.out.println("=== Area Calculator ===");
            System.out.println("1. Calculate the area of a triangle (base, height)");
            System.out.println("2. Calculate the area of a circle (r)");
            System.out.println("3. Calculate the area of a rectangle (length, width)");
            System.out.println("4. Exit the program");
            System.out.print("Enter your choice: ");
            
            int i = scanner.nextInt();

            switch (i) {
                case 1:
                    
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("Area of Triangle = " + triangleArea);
                    break;

                case 2:
                    
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    double circleArea = 3.14 * radius * radius;
                    System.out.println("Area of Circle = " + circleArea);
                    break;

                case 3:
                    
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = length * width;
                    System.out.println("Area of Rectangle = " + rectangleArea);
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } 
    
}
