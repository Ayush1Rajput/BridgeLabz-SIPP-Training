import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter the principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter the time (in years): ");
        int time = sc.nextInt();
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();
        
        sc.close(); // Close the scanner

        // Calling the method for calculating the simple interest
        countSimpleInterest(principal, rate, time);
    }

    // Method to calculate simple interest
    public static void countSimpleInterest(int principal, double rate, int time) {
        //Count the simple interest by using formula 
        double simpleInterest = (principal * rate * time) / 100;
        // Output the result
        System.out.printf("The Simple Interest is %.2f for Principal %d, Rate of Interest %.2f%% and Time %d years.%n",simpleInterest, principal, rate, time);
    }
}
