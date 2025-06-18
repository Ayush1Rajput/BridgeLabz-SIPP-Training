import java.util.Scanner;

public class CalendarUtility {

    // Method to get name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get number of days in the given month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to find the first day of the month using Gregorian algorithm
    public static int getStartDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getNumberOfDays(month, year);
        int startDay = getStartDay(month, year);

        // Display header
        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation for the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // For final line spacing
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Print calendar
        printCalendar(month, year);

        sc.close();
    }
}
