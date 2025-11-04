// Write a java program to convert the decimal number to binary and vice versa.
package JAVA.Lab_4;

import java.util.Scanner;

public class Q18 {
    
     public static void main(String args[]) {
        
        System.out.println("Enter \n0 for finding Binary number of a Decimal number  \n1 for finding Decimal number of a Binary number : ");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        if(i==0){
            System.out.println("Enter a Decimal Number:");
            long num =sc.nextLong();
            long ans=binary(num);
            System.out.println(num+" in binary is :"+ ans);
        }
        else if(i==1){
            System.out.println("Enter a Binary Number:");
            long num =sc.nextLong();
            long ans=decimal(num);
            System.out.println(num+" in decimal is :"+ ans);
        }
        
    }
    static long decimal(long num){
        long pow=1;
        long de=0;
        
        while(num>0){
            long digit=num%10;
            digit=digit*pow;
            de=de+(digit);
            num=num/10;
            
            pow=pow*2;
        }
        return de;
        
    }
    static long binary(long num){
        long bi=0;
        long sum=1;
        
        while(num>0){
            long rem=num%2;
            bi=bi+(rem*sum);
            num=num/2;
            sum=sum*10;
        }
        return bi;
    }
    
}
