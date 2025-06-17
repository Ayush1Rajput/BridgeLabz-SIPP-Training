import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter a year (greater than or equal to 1582): ");
        int year = sc.nextInt();

        sc.close(); // Close the scanner

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("Year must be 1582 or later as per the Gregorian calendar.");
            return;
        }

        // Calling the method to check leap year
        boolean isLeap = isLeapYear(year);

        // Display result
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year logic
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
