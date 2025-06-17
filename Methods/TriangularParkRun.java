import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user for the three sides of the triangle
        System.out.print("Enter the length of side 1 : ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 : ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 : ");
        double side3 = sc.nextDouble();

        sc.close(); // Close the scanner

        // Calling the method for calculating the number of rounds to complete 5 km
        countNumberOfRounds(side1, side2, side3);
    }

    // Method to calculate how many rounds are needed to complete 5 km
    public static void countNumberOfRounds(double a, double b, double c) {

        // Calculate the perimeter of the triangular park
        double perimeter = a + b + c;

        // Total distance to run is 5000 meters (5 km)
        double distance = 5000;

        // Calculate the number of rounds needed
        double rounds = distance / perimeter;

        // Output the result
        System.out.printf("To complete a 5 km run, the athlete must complete %.2f rounds around the triangular park.", rounds);
    }
}
