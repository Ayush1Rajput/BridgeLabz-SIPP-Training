public class Book{
    String title;
    String auther;
    int price;

    // Default Constructor
    public Book(){
        this.title = "";
        this.auther = "";
        this.price = 0;
    }

    // Parameterized Constructor
    public Book(String title, String auther, int price){
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

    // Method for display the details about book
    public void displayDetails(){
        System.out.println("---- Details about book ----");
        System.out.println("Book Title : "+title);
        System.out.println("Auther Name : "+auther);
        System.out.println("Price of Book : "+price);
        System.out.println();
    }

    public static void main(String[] args) {
        // Call the default constructor
        Book book = new Book();
        book.auther = "Maharishi Veda Vyasa";
        book.title = "bhagwat geeta";
        book.price = 100;

        // calling the method for display the details 
        book.displayDetails();

        // Call the Parameterized Constructor
        Book book1 = new Book("XYZ","ABC",500);

        // calling the method for display the details 
        book1.displayDetails();

    }


}