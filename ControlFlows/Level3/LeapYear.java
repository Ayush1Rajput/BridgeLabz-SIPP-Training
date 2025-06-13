import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Input the year (>= 1582): ");
        int year = sc.nextInt();

        // Checking if the year is in valid Gregorian range
        if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
        } else {
            // Writing the logic using if-else
            if (year % 4 != 0) {
                System.out.println("Is the year " + year + " a Leap Year? No");
            } else {
                if (year % 100 != 0) {
                    System.out.println("Is the year " + year + " a Leap Year? Yes");
                } else {
                    if (year % 400 == 0) {
                        System.out.println("Is the year " + year + " a Leap Year? Yes");
                    } else {
                        System.out.println("Is the year " + year + " a Leap Year? No");
                    }
                }
            }
        }

        // Closing the scanner class
        sc.close();
    }
}
