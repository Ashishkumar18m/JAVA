/*30) Write a java program to implement multiple inheritance.*/
package JAVA.Lab_6;

// First interface
interface A {
    void showA();
}

// Second interface
interface B {
    void showB();
}

// A class implementing both interfaces (multiple inheritance)
class Multiple implements A, B {

    @Override
    public void showA() {
        System.out.println("Inside interface A method.");
    }

    @Override
    public void showB() {
        System.out.println("Inside interface B method.");
    }
}
public class Q30 {
    public static void main(String[] args) {
        
        Multiple obj = new Multiple();
        
        obj.showA();
        obj.showB();
    }
}
