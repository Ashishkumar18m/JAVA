package JAVA;

//
//class addsub {
//
//    double n, m;
//
//    addsub(double n1, double m1) {
//        n = n1;
//        m = m1;
//    }
//
//    double add() {
//        return (n + m);
//    }
//
//    double sub() {
//        return n - m;
//    }
//}
//
//class muldiv extends addsub{
//    
//    muldiv(double n1, double m1) {
//        super(n1, m1);
//    }
//    double Mul(){
//        return n*m;
//    }
//    double Div(){
//        return n/m;
//    }
//    double Div(int a,int b){
//        return a/b;
//    }
//    
//}
//    public class practice_class {
//
//        public static void main(String args[]) {
////            addsub obj1 = new addsub(2, 3);
////            System.out.println(obj1.add());
////            System.out.println(obj1.sub());
//              muldiv obj1 = new muldiv(2, 3);
//              System.out.println(obj1.add());
//              System.out.println(obj1.sub());
//              System.out.println(obj1.Mul());
//              System.out.println(obj1.Div(4,2));
//
//        }
//
//    }



//*27) Write a java program to add two Integer and two float numbers, when no arguments are supplied, give a 
//default value to calculate the sum. Hint: Apply method overloading.*/

class Add{
    int a,b;
    float c,d;
    Add(){
        
        
    }
//    int add(int a,int b){
//        return a+b;
//    }
//    float add(float a,float b){
//        return a+b;
//    }
    
    float add(float a,float b){
        return a+b;
    }
    void add(){
        a=2;
        b=3;
        c=5.4f;
        d=6.6f;
        System.out.println("No arguments supplied, using default values:");
        System.out.println("Sum of integers (" + a + " + " + b + ") = " + (a + b));
        System.out.println("Sum of floats (" + c + " + " + d + ") = " + (c + d));

            
    }
}
 public class practice_class {

        public static void main(String args[]) {
            Add obj=new Add();
            obj.add();
            System.out.println(obj.add(3,4));
            System.out.println(obj.add(3.6f,4.4f));

        }}
