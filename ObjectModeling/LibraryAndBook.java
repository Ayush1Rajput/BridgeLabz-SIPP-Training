import java.util.ArrayList;

// Library Class 
    class Library{

        private ArrayList<Book> books;   // List for book class

        // Constructor
        public Library(){
            books = new ArrayList<>();
        }

        // Method for adding book from Book object  
        public void addBook(Book book){
            books.add(book);
        }

        // Method for display the details of books in Library 
        public void displayLibraryBooks(){
            System.out.println("\n ----- Book in the Library -----");
            for(Book book: books){
                book.displayBookDetails();
            }
        }
    }

    // Book Class
    class Book{
        private String title;
        private String author;


        // parametrized Constructor
        public Book(String title, String author){
            this.author = author;
            this.title= title;
        }

        // Method for display the detail of book
        public void displayBookDetails(){
            System.out.println("Title : " + title);
            System.out.println("Author : " + author);

        }


    }

public class LibraryAndBook {
    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create some library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to the libraries (Aggregation)
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);  // The same book can be in multiple libraries
        library2.addBook(book3);

        // Display books in both libraries
        System.out.println("Library 1:");
        library1.displayLibraryBooks();

        System.out.println("\nLibrary 2:");
        library2.displayLibraryBooks();
    }
}
   