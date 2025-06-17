import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        sc.close(); // Close the scanner

        // Calling the method to calculate sine, cosine, and tangent
        double[] results = calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.printf("Sine(%.2f°) = %.4f%n", angle, results[0]);
        System.out.printf("Cosine(%.2f°) = %.4f%n", angle, results[1]);
        System.out.printf("Tangent(%.2f°) = %.4f%n", angle, results[2]);
    }

    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return results as an array
        return new double[]{sine, cosine, tangent};
    }
}
