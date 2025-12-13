/*26) Write a java program to perform mathematical operations. Create a class AddSub having two double 
variables and two methods to perform Addition and Subtraction. Create another class MulDiv that inherits 
the AddSub class to use the data members of the super class. MulDiv should have multiply and Divide. 
A main function should access the methods and perform the mathematical operations.    */

package JAVA.Lab_6;

class AddSub{
    double n,m;
    
    AddSub(double n1,double n2){
        n=n1;
        m=n2;
    }
    double Add(){
        return n+m;
    }
    double Sub(){
        return n-m;
    }
    
}

class MulDiv extends AddSub{
    MulDiv(double n1,double n2){
       super(n1,n2);
    }
    double Mul(){
        return n*m;
    }
    double Div(){
        return n/m;
    }
    
    
    
       
}
public class Q26 {
    public static void main(String args[]) {
         MulDiv obj =new MulDiv(2,3);
         System.out.println(obj.Add());
         System.out.println(obj.Sub());
         System.out.println(obj.Mul());
         System.out.println(obj.Div());
    }
}
