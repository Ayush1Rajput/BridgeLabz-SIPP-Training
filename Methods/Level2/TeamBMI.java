import java.util.Scanner;

public class TeamBMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] weights = new double[10];
        double[] heights = new double[10];
        double[] bmis = new double[10];
        String[] statuses = new String[10];

        // Take input for weight and height for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Calculate BMI and determine status for each member
        for (int i = 0; i < 10; i++) {
            double heightInMeters = heights[i] / 100.0;
            bmis[i] = weights[i] / (heightInMeters * heightInMeters);

            // Determine BMI status
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        
        sc.close();
    }
}
