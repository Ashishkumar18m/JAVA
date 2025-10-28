/*Given a number n, write a method that sums all multiples of three and five
up to n.*/
package JAVA.Lab_3;

import java.util.Scanner;

public class Q13 {public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=s.nextInt();
        int Sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                Sum=Sum+i;
            }
        }
        
      System.out.print(Sum);
    }
    
}
