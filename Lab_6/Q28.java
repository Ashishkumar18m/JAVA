/*28) Write a java program to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' 
with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter 
each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' 
is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' 
for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all 
the three methods. */

package JAVA.Lab_6;

// Abstract class Shape
abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

// Class Area implementing all abstract methods
class Area extends Shape {

    @Override
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    @Override
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }

    @Override
    void CircleArea(double radius) {
        double area = 3.14159 * radius * radius; // πr²
        System.out.println("Area of Circle = " + area);
    }
}
public class Q28 {
     public static void main(String args[]) {
         Area obj = new Area();

        obj.RectangleArea(5, 3);
        obj.SquareArea(4);
        obj.CircleArea(2.5);
    }
}
