package Arrays.Level2;

import java.util.*;

public class StudentMarksEvaluation {
    public static void main(String[] args) {
        
        // creating the scanner class
        Scanner sc = new Scanner(System.in);

        // getting number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // creating the 2D array to store marks and 1D arrays for percentage and grade
        int[][] marks = new int[numberOfStudents][3];
        double[] percentage = new double[numberOfStudents];
        String[] grade = new String[numberOfStudents];

        // taking input for marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print(subject + ": ");
                int mark = sc.nextInt();

                // check for negative marks
                if (mark < 0 || mark > 100) {
                    System.err.println("Invalid mark! Please enter a value between 0 to 100.");
                    j--; // repeat for same subject
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        // calculating percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // determining grade based on percentage
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

        // displaying result
        System.out.println("Student Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

        // closing scanner class
        sc.close();
    }
}

