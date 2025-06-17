import java.util.Scanner;

public class StudentVoteChecker {

    public static void main(String[] args) {
        // Create scanner object
        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to get input for ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Loop to check voting eligibility and display result
        for (int i = 0; i < ages.length; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close(); // Close the scanner
    }

    // Method to check if student can vote
    public static boolean canStudentVote(int age) {
        // Validate negative age
        if (age < 0) {
            return false;
        }
        // Check if age is 18 or more
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
