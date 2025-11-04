//Generate the following patterns (attached as an image) using nested loops.
/*   *                  * * * * *         1                   1 2 3 4 5
     * *                * * * *           1 2                 1 2 3 4
     * * *              * * *             1 2 3               1 2 3
     * * * *            * *               1 2 3 4             1 2
     * * * * *          *                 1 2 3 4 5           1
     
                      1
                    2 3 2 
                  3 4 5 4 3
                4 5 6 7 6 5 4
              5 6 7 8 9 8 7 6 5



*/                    






package JAVA.Lab_4;

import java.util.Scanner;

public class Q19 {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        //
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        
        //
        for(int i=n;i>=0;i--){
            for(int j=0;j<n;j++){
                if(i>=j){
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        
        //
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j){
                    System.out.print(j+" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        
        //
        for(int i=5;i>=0;i--){
            for(int j=0;j<6;j++){
                if(i>=j){
                    System.out.print(j+" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        
        //
       for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }

            // increasing part
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }

            // decreasing part
            num = num - 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num-- + " ");
            }

            System.out.println();
       }  
      
        
    }
}
