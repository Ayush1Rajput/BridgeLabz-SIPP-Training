package FunctionalInterface.DateFormatUtility;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class Main {
	public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Different Date Formats:");
        System.out.println("Format 1 (dd/MM/yyyy): " + DateUtils.formatDate(today, "dd/MM/yyyy"));
        System.out.println("Format 2 (MMMM dd, yyyy): " + DateUtils.formatDate(today, "MMMM dd, yyyy"));
        System.out.println("Format 3 (yyyy-MM-dd): " + DateUtils.formatDate(today, "yyyy-MM-dd"));
    }
}
