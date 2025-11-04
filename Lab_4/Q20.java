//Write a java program to search for an element in an array.
package JAVA.Lab_4;

import java.util.Scanner;

public class Q20 {

     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array element :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.println("Enter key for search :");
        int x = sc.nextInt();
        int r = -1;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                System.out.print("Key " + x + " found at index " + i+"\n");
                r = 1;
            }

        }
        if (r == -1) {
            System.out.print("key not found");
        }
    }
    
}
