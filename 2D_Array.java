package JAVA;

import java.util.Scanner;

public class 2D_Array {
    





    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

//Input a 2D Array
        System.out.print("Enter rows and columns of 2D array(Matrix) (m*n):");
        int m = s.nextInt();
        int n = s.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter Array elements " + m * n + " :[");
        int freq[]=new int[1000];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
                freq[arr[i][j]]++;
            }
        }
        System.out.println("]");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+":"+freq[i]);
            }
        }
        

//Display the Array
        System.out.println("Array :");
        System.out.print("{\n");
        for (int i = 0; i < m; i++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("}\n");
        }
        System.out.print("}");

// Search in the array
        /* System.out.print("Enter Key to search in array:");
     int key=s.nextInt();
     int found=0;
     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             if(key==arr[i][j]){ 
                 System.out.print("key "+key+" found at index:["+i+","+j+"]");
                 found=1;
             }
         }
     }
     if(found==0){
         System.out.print("key not found!");
     }*/
        

//Find largest and smallest and second largest and second smallest
        /* int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
            if (max<=arr[i][j]) {
                max=arr[i][j];
            }}}
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
            if(min>arr[i][j]){
                min=arr[i][j];
            }
        }
        }
        System.out.println("Maximum "+max);
        System.out.println("Minimum "+min);
        
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
            if (smax<=arr[i][j] && arr[i][j]<max) {
                smax=arr[i][j];
            }}}
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
            if(smin>=arr[i][j] &&  arr[i][j]>min){
                smin=arr[i][j];
            }}
        }
        System.out.println("Second Maximum "+smax);
        System.out.print("Second Minimum "+smin);*/
        

// Transpose the matrix
        /*int arr1[][]=new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               arr1[i][j]=arr[j][i];
           }
       }
       

//Display the Array
    System.out.println("Array :");
     System.out.print("{\n");
     for(int i=0;i<n;i++){
         System.out.print("{");
         for(int j=0;j<m;j++){
             System.out.print(arr1[i][j]+" ");
         }
         System.out.print("}\n");
     }
     System.out.print("}");*/
// multiply 2 matrices
      /*  System.out.print("Enter rows and columns of 2D array(Matrix) (m*n):");
        int p = s.nextInt();
        int q = s.nextInt();
        int arr2[][] = new int[p][q];
        System.out.println("Enter Array elements " + p * q + " :[");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
        System.out.println("]");
        //Display the Array
        System.out.println("Array :");
        System.out.print("{\n");
        for (int i = 0; i < p; i++) {
            System.out.print("{");
            for (int j = 0; j < q; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.print("}\n");
        }
        System.out.print("}");

        int result[][] = new int[arr.length][arr2[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    result[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }*/

    }
}
