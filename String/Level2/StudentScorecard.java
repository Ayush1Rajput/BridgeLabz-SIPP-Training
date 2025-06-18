import java.util.Scanner;

public class StudentScorecard {
    public static void main(String[] args) {
        // Create scanner class
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step a: Generate random scores
        int[][] pcmScores = generateScores(n);

        // Step b: Calculate total, average, percentage
        double[][] scoreDetails = calculateStats(pcmScores);

        // Step c: Generate grades
        String[] grades = generateGrades(scoreDetails);

        // Step d: Display Scorecard
        displayScorecard(pcmScores, scoreDetails, grades);

        sc.close(); // Close scanner
    }

    // Method to generate random scores
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // 3 subjects: PCM
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 51) + 50; // Physics: 50-100
            scores[i][1] = (int) (Math.random() * 51) + 50; // Chemistry
            scores[i][2] = (int) (Math.random() * 51) + 50; // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 digits
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to assign grades based on percentage
    public static String[] generateGrades(double[][] stats) {
        String[] grade = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];
            if (percent >= 80) grade[i] = "A";
            else if (percent >= 70) grade[i] = "B";
            else if (percent >= 60) grade[i] = "C";
            else if (percent >= 50) grade[i] = "D";
            else if (percent >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\nScorecard:");
        System.out.println("ID\tPhysics\tChem\tMaths\tTotal\tAverage\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int) stats[i][0] + "\t");
            System.out.print(stats[i][1] + "\t");
            System.out.print(stats[i][2] + "\t");
            System.out.print(grades[i] + "\n");
        }
    }
}
