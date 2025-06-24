public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        defaultBook.displayInfo();

        System.out.println();

        // Using parameterized constructor
        Book customBook = new Book("XYZ", "ABC", 1499);
        customBook.displayInfo();
    }
}
