import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input for kilometers to miles
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println("In miles: " + UnitConverter.convertKmToMiles(km));

        // Getting input for miles to kilometers
        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();
        System.out.println("In kilometers: " + UnitConverter.convertMilesToKm(miles));

        // Getting input for meters to feet
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println("In feet: " + UnitConverter.convertMetersToFeet(meters));

        // Getting input for feet to meters
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println("In meters: " + UnitConverter.convertFeetToMeters(feet));

        sc.close(); // Close the scanner
    }

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}
