import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println();
        
        // Generate random ages for students
        int[] ageArray = generateRandomAges(n);

        // Check voting eligibility
        String[][] votingStatus = checkVotingEligibility(ageArray);

        // Display result in tabular format
        displayResult(votingStatus);

        sc.close(); // Close the scanner
    }

    // Method to generate random 2-digit ages
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            // Random age between 10 and 99
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }

    // Method to check voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "False (Invalid Age)";
            } else if (age >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("Student\tAge\tCan Vote");
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.println("  " + (i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }
}
