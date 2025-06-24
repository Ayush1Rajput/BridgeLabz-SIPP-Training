public class MovieTicket {
    // Attributes
    String movieName;
    String seatNumber;
    double price;

    // Constructor (initially empty ticket)
    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
    }

    // Method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket();

        // Book a ticket
        ticket.bookTicket("Inception", "B12", 250.00);

        // Display ticket details
        ticket.displayTicketDetails();
    }
}
