public class Library {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized constructor
    public Library(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: \"" + title + "\"");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : $" + price);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a book object
        Library book1 = new Library("The Alchemist", "Paulo Coelho", 1299, true);

        // Display book info
        System.out.println("Book Details:");
        book1.displayInfo();

        System.out.println();

        // Attempt to borrow the book
        book1.borrowBook();

        System.out.println();

        // Check availability after borrowing
        book1.displayInfo();

        System.out.println();

        // Try borrowing again
        book1.borrowBook();
    }
}
