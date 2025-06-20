import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take date input from the user
        LocalDate inputDate = takeDateInput(sc);

        // Perform date arithmetic
        LocalDate resultDate = performDateOperations(inputDate);

        // Display the result
        displayResult(inputDate, resultDate);

        sc.close();
    }

    // Method to take input date from the user
    static LocalDate takeDateInput(Scanner sc) {
        System.out.print("Enter the date in format (yyyy-MM-dd): ");
        String input = sc.nextLine();
        System.out.println();
        return LocalDate.parse(input);
    }

    // Method to perform date addition and subtraction
    static LocalDate performDateOperations(LocalDate date) {
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        updatedDate = updatedDate.minusWeeks(3);
        return updatedDate;
    }

    // Method to display the result
    static void displayResult(LocalDate originalDate, LocalDate finalDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Original Date: " + originalDate.format(formatter));
        System.out.println("Final Date after operations: " + finalDate.format(formatter));
        System.out.println();
    }
}
