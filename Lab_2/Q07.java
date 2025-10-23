/* Write a Java program to find the largest, second largest and smallest of 4 
numbers using nested if statements.*/
package JAVA.Lab_2;

import java.util.Scanner;

public class Q07 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int largest, secondLargest, smallest;

        if (a > b && a > c && a > d) {
            largest = a;
        } else if (b > c && b > d) {
            largest = b;
        } else if (c > d) {
            largest = c;
        } else {
            largest = d;
        }

        if (a < b && a < c && a < d) {
            smallest = a;
        } else if (b < c && b < d) {
            smallest = b;
        } else if (c < d) {
            smallest = c;
        } else {
            smallest = d;
        }

        if (largest == a) {
            if (b > c && b > d) secondLargest = b;
            else if (c > d) secondLargest = c;
            else secondLargest = d;
        } else if (largest == b) {
            if (a > c && a > d) secondLargest = a;
            else if (c > d) secondLargest = c;
            else secondLargest = d;
        } else if (largest == c) {
            if (a > b && a > d) secondLargest = a;
            else if (b > d) secondLargest = b;
            else secondLargest = d;
        } else {
            if (a > b && a > c) secondLargest = a;
            else if (b > c) secondLargest = b;
            else secondLargest = c;
        }

        
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Smallest: " + smallest);

      }
}
