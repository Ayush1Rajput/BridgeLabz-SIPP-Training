package FunctionalInterface.DateFormatUtility;


import java.time.*;
import java.time.format.*;

public interface DateUtils {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
