import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {

    public static void main(String[] args) {
        // Get current times in different time zones
        ZonedDateTime gmtTime = getCurrentTime("GMT");
        ZonedDateTime istTime = getCurrentTime("Asia/Kolkata");
        ZonedDateTime pstTime = getCurrentTime("America/Los_Angeles");

        // Display results
        displayTime("Greenwich Mean Time (GMT)", gmtTime);
        displayTime("Indian Standard Time (IST)", istTime);
        displayTime("Pacific Standard Time (PST)", pstTime);
    }

    // Method to get current time in a specific time zone
    static ZonedDateTime getCurrentTime(String zoneId) {
        return ZonedDateTime.now(ZoneId.of(zoneId));
    }

    // Method to display the time in a readable format
    static void displayTime(String zoneLabel, ZonedDateTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        System.out.println(zoneLabel + ": " + time.format(formatter));
        System.out.println();
    }
}
