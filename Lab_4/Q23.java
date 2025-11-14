//Write a java program to find the transpose of a matrix.
package JAVA.Lab_4;

import java.util.Scanner;

public class Q23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of matrix(m,n):");
        int m = sc.nextInt();
        int n = sc.nextInt();

        //matrix 1
        int arr1[][] = new int[m][n];
        System.out.println("Enter " + m * n + " elements of matrix :");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Matrix :\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        // Transpose
        int arr2[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               arr2[i][j]=arr1[j][i];
               
            }
            
        }
        System.out.print("Transpose Matrix :\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("\n");
        }
        
    }
}
