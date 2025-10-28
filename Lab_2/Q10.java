/*Write a Java program to find the average of the student’s grades knowing that
the number of students and the number of student courses shall be given by the 
user. Note: The Number of students should be more than zero, and the student
grades should be between 0 – 100. Assign letter grades for the student average 
based on the distribution below:
A: 90 – 100
B: 80 – 89
C: 70 – 79
D: 60 – 69
F: 0 – 59
Count and print the number of the students who got an A grade.*/
package JAVA.Lab_2;

import java.util.Scanner;



public class Q10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        if (numStudents <= 0) {
            System.out.println("Number of students must be more than zero.");
            return;
        }

      
        System.out.print("Enter the number of courses per student: ");
        int numCourses = sc.nextInt();

        if (numCourses <= 0) {
            System.out.println("Number of courses must be more than zero.");
            return;
        }

        int countA = 0;

        
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\n--- Enter grades for Student " + i + " ---");
            double sum = 0;

            for (int j = 1; j <= numCourses; j++) {
                System.out.print("Enter grade for course " + j + " (0-100): ");
                double grade = sc.nextDouble();

                
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade! It will be considered as 0.");
                    grade = 0;
                }

                sum += grade;
            }

            double average = sum / numCourses;
            char letterGrade;

            if (average >= 90) {
                letterGrade = 'A';
                countA++;
            } else if (average >= 80) {
                letterGrade = 'B';
            } else if (average >= 70) {
                letterGrade = 'C';
            } else if (average >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.print("Student "+i+" average:"+average+ " -> Grade:"+letterGrade);
        }

        
        System.out.println("\nNumber of students who got an A: " + countA);

      
    }
}

         

        

