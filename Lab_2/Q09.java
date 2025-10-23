/*Write a program to take the student’s grade as an input argument and print 
the comments as follows- 100 (Perfect Score), 90-100 (Excellent), 80-90 (Good)
, 70-80 (Above Average), 60-70 (Average) 50-60 (Below Average), 0-50 
(Not Passing). Use a switch statement. Hint: For example - 95/10 is 9.*/
package JAVA.Lab_2;

import java.util.Scanner;

public class Q09 {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter grade:");
        float g=s.nextFloat();
        int i=(int)g/10;
        switch(i){  
            case 10:
                if(g==100){
                System.out.print("Perfect Score");
                }else{
                    System.out.print("Invalid Number");
                }
                break;
            case 9:
                System.out.print("Excellent");
                break;
            case 8:
                System.out.print("Good");
                break;
            case 7:
                System.out.print("Above Average");
                break;
            case 6:
                System.out.print("Average");
                break;
            case 5:
                System.out.print("Below Average");
                break;
            case 4:case 3:case 2:case 1:case 0:
                System.out.print("Not Passing");
                break;
            default:
                System.out.print("Invalid Number.");
     
        }
        
    }
}
