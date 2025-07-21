package Scenario_Based_Question.EventHive;

//EventManager Interface
interface EventManager {
 void addEvent(String name, String date, String location);
 void removeEvent(String name);
}

//Event Class
class Event {
 String name;
 String date;
 String location;

 public Event(String name, String date, String location) {
     this.name = name;
     this.date = date;
     this.location = location;
 }

 public void displayEventDetails() {
     System.out.println("Event: " + name + ", Date: " + date + ", Location: " + location);
 }
}

//Ticket Class
class Ticket {
 String userName;
 Event event;

 public Ticket(String userName, Event event) {
     this.userName = userName;
     this.event = event;
 }

 public void printTicket() {
     System.out.println("----- Ticket Details -----");
     System.out.println("Name: " + userName);
     System.out.println("Event: " + event.name);
     System.out.println("Date: " + event.date);
     System.out.println("Location: " + event.location);
 }
}

//User Class
class User {
 String name;

 public User(String name) {
     this.name = name;
 }

 public Ticket registerForEvent(Event event) {
     System.out.println(name + " registered successfully for " + event.name);
     return new Ticket(name, event);
 }
}

//Admin Class
class Admin implements EventManager {
 Event activeEvent;

 @Override
 public void addEvent(String name, String date, String location) {
     activeEvent = new Event(name, date, location);
     System.out.println("Event added successfully: " + name);
 }

 @Override
 public void removeEvent(String name) {
     if (activeEvent != null && activeEvent.name.equalsIgnoreCase(name)) {
         System.out.println("Event removed: " + activeEvent.name);
         activeEvent = null;
     } else {
         System.out.println("No such event to remove.");
     }
 }

 public Event getActiveEvent() {
     return activeEvent;
 }
}

//Main Runner Class
public class EventHive {
 public static void main(String[] args) {
     java.util.Scanner scanner = new java.util.Scanner(System.in);
     Admin admin = new Admin();

     // Admin adds an event
     admin.addEvent("CodeFest", "2025-08-10", "Tech Hall");

     // Display event details
     Event currentEvent = admin.getActiveEvent();
     if (currentEvent != null) {
         currentEvent.displayEventDetails();
     }

     // User registration
     System.out.print("Enter your name to register: ");
     String userName = scanner.nextLine();
     User user = new User(userName);

     if (currentEvent != null) {
         Ticket ticket = user.registerForEvent(currentEvent);
         ticket.printTicket();
     }

     // Admin removes event
     System.out.print("Enter event name to remove: ");
     String eventName = scanner.nextLine();
     admin.removeEvent(eventName);

     scanner.close();
 }
}
