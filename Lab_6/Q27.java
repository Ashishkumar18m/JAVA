/*27) Write a java program to add two Integer and two float numbers, when no arguments are supplied, give a 
default value to calculate the sum. Hint: Apply method overloading.*/

package JAVA.Lab_6;

class Add{
    int a,b;
    float c,d;
    
    int add(int a,int b){
        return a+b;
        
    }
    float add(float a,float b){
        return a+b;
        
    }
     void add() {
        int a = 10;      
        int b = 20;
        float x = 5.5f;  
        float y = 4.5f;

        System.out.println("No arguments supplied, using default values:");
        System.out.println("Sum of integers (" + a + " + " + b + ") = " + (a + b));
        System.out.println("Sum of floats (" + x + " + " + y + ") = " + (x + y));
    }
}
public class Q27 {
   
    public static void main(String args[]) {
        Add obj=new Add();
        obj.add();
        System.out.println(obj.add(2, 4));
        System.out.println(obj.add(2.3f, 4.5f));
    }
 
}
