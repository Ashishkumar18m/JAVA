/* Write a method that calculates the factorial of a given number.*/
package JAVA.Lab_3;

import java.util.Scanner;

public class Q14 {public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = s.nextInt();
        long ans=factorial(num);
        
        System.out.print("The Factorial of "+num+" is "+ans+".");
            
    }
    static long factorial(int num){
        long fact=1;
        while(num>=1){
            fact=fact*num;
            num--;
        }
        return fact;
    }    

    
}
