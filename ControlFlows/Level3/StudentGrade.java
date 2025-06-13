import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting input for all three subjects
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        // Calculating total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        // Displaying the average
        System.out.println("Average Marks (Percentage): " + percentage + "%");

        // Determining the grade and remarks
        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A";
            remarks = "Excellent performance!";
        } else if (percentage >= 80) {
            grade = "B";
            remarks = "Very good!";
        } else if (percentage >= 70) {
            grade = "C";
            remarks = "Good job!";
        } else if (percentage >= 60) {
            grade = "D";
            remarks = "Satisfactory.";
        } else if (percentage >= 50) {
            grade = "E";
            remarks = "Needs improvement.";
        } else {
            grade = "F";
            remarks = "Failed. Try harder next time.";
        }

        // Showing grade and remarks
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Closing the scanner class
        sc.close();
    }
}
