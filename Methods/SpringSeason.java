import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        // Creating the scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter the month : ");
        int month = sc.nextInt();

        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        sc.close(); // Close the scanner

        // Calling the method to check whether it's Spring season or not
        boolean isSpring = checkSpringSeason(month, day);

        // Output the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // Method to check if the date falls in Spring Season (March 20 to June 20)
    public static boolean checkSpringSeason(int month, int day) {
        
        // Check for each month's valid spring range
        if ((month == 3 && day >= 20 && day <= 31) || // March 20–31
            (month == 4 && day >= 1 && day <= 30) ||  // April
            (month == 5 && day >= 1 && day <= 31) ||  // May
            (month == 6 && day >= 1 && day <= 20)) {  // June 1–20
            return true;
        } else {
            return false;
        }
    }
}
