package Scenarios_Questions.HospitalAppointmentQueue;

public class Main {
	public static void main(String[] args) {
        QueueManager<Appointment> appointmentQueue = new QueueManager<>();

        // Add appointments
        appointmentQueue.addItem(new Appointment("Alice", "Dr. Smith", "10:00 AM"));
        appointmentQueue.addItem(new Appointment("Bob", "Dr. Jones", "10:30 AM"));
        appointmentQueue.addItem(new Appointment("Charlie", "Dr. Smith", "11:00 AM"));

        System.out.println();

        // View all appointments
        appointmentQueue.showAll();

        System.out.println();

        // Peek at the next appointment
        appointmentQueue.peekNext();

        System.out.println();

        // Serve appointments in FIFO order
        appointmentQueue.serveNext();
        appointmentQueue.serveNext();

        System.out.println();

        // View remaining appointments
        appointmentQueue.showAll();}
}
