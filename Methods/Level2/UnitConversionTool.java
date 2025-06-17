import java.util.Scanner;

public class UnitConversionTool {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input for yards to feet
        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();
        System.out.println("In feet: " + convertYardsToFeet(yards));

        // Getting input for feet to yards
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println("In yards: " + convertFeetToYards(feet));

        // Getting input for meters to inches
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println("In inches: " + convertMetersToInches(meters));

        // Getting input for inches to meters
        System.out.print("Enter distance in inches (for meter conversion): ");
        double inches = sc.nextDouble();
        System.out.println("In meters: " + convertInchesToMeters(inches));

        // Getting input for inches to centimeters
        System.out.print("Enter distance in inches (for centimeter conversion): ");
        double inchesForCm = sc.nextDouble();
        System.out.println("In centimeters: " + convertInchesToCentimeters(inchesForCm));

        sc.close(); // Close the scanner
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
