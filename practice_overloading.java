package JAVA;


public class practice_overloading {
    
class box{
    int w=3,h,m;
    box(){
        
    }
    box(int f){
        w=10;h=12;m=10;
    }
    box(double f){
        w=1;h=2;m=3;
    }
}
     public static void main(String args[]) {
         box obj2=new box();
         box obj3=new box(3.0);
         box obj1=new box(3.0);
         System.out.println(obj1.w*obj1.h);
         System.out.println(obj2.w);
         System.out.println(obj2.h);
     }
    
}
