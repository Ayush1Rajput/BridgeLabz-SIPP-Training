import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two date inputs from the user
        LocalDate date1 = takeDateInput(sc, "Enter the first date (yyyy-MM-dd): ");
        LocalDate date2 = takeDateInput(sc, "Enter the second date (yyyy-MM-dd): ");

        // Compare the dates
        String result = compareDates(date1, date2);

        // Display the result
        displayComparisonResult(date1, date2, result);

        sc.close();
    }

    // Method to take a date input with a custom prompt
    static LocalDate takeDateInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        String input = sc.nextLine().trim();
        return LocalDate.parse(input);
    }

    // Method to compare two dates and return a message
    static String compareDates(LocalDate d1, LocalDate d2) {
        if (d1.isBefore(d2)) {
            return "before";
        } else if (d1.isAfter(d2)) {
            return "after";
        } else {
            return "equal to";
        }
    }

    // Method to display comparison result
    static void displayComparisonResult(LocalDate d1, LocalDate d2, String result) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("\nFirst Date: " + d1.format(formatter));
        System.out.println("Second Date: " + d2.format(formatter));
        System.out.println("The first date is " + result + " the second date.");
        System.out.println();
    }
}
