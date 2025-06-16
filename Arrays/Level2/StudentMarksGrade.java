package Arrays.Level2;

import java.util.*;

public class StudentMarksGrade {
    public static void main(String[] args) {

        // creating scanner
        Scanner sc = new Scanner(System.in);

        // taking input for number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // declaring arrays to store marks, percentage and grades
        int[][] marks = new int[number][3]; // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // input marks for each student
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + " marks: ");
                    int mark = sc.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid input! Please enter marks between 0 and 100.");
                    }
                }
            }
        }

        // calculating percentage and grade
        for (int i = 0; i < number; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // displaying results
        System.out.println("--- Student Result Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        // closing scanner
        sc.close();
    }
}
