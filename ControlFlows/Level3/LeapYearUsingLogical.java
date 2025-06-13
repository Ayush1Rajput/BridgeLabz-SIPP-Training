import java.util.*;

public class LeapYearUsingLogical {
    
    public static void main(String[] args) {
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Input the year (>= 1582): ");
        int year = sc.nextInt();

        // Checking if year is valid
        if (year >= 1582) {
            // Writing the logic using a single if condition with && and ||
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Is the year " + year + " a Leap Year? Yes");
            } else {
                System.out.println("Is the year " + year + " a Leap Year? No");
            }
        } else {
            System.out.println("The year must be 1582 or later.");
        }

        // Closing the scanner class
        sc.close();
    }
}
