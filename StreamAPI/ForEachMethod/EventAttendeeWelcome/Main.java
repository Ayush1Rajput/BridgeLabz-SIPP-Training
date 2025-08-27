package StreamAPI.ForEachMethod.EventAttendeeWelcome;

import java.util.*;

public class Main {
	public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Ayush", "Divanshu", "Riya", "Aman");

        System.out.println("Welcome Messages:");
        attendees.forEach(name -> System.out.println("Welcome, " + name + "! Enjoy the event."));
    }
}
