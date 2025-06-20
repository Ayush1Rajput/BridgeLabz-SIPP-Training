import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatDisplay {

    public static void main(String[] args) {
        // Get current date
        LocalDate currentDate = getCurrentDate();

        // Display the date in different formats
        displayFormattedDates(currentDate);
    }

    // Method to get the current date
    static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    // Method to display the date in three formats
    static void displayFormattedDates(LocalDate date) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Date in dd/MM/yyyy format      : " + date.format(format1));
        System.out.println("Date in yyyy-MM-dd format      : " + date.format(format2));
        System.out.println("Date in EEE, MMM dd, yyyy format: " + date.format(format3));
        System.out.println();
    }
}
