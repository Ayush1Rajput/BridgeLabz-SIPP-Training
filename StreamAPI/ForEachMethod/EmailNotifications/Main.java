package StreamAPI.ForEachMethod.EmailNotifications;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("ayush@gmail.com", "divanshu@gmail.com", "riya@yahoo.com");

        System.out.println("Sending Email Notifications:");
        emails.forEach(email -> sendEmailNotification(email));
    }

    public static void sendEmailNotification(String email) {
        System.out.println("Email sent to: " + email);
    }
}

