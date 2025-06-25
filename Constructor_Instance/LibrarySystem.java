public class LibrarySystem {

    // Book class
    static class Book {
        public String ISBN;           // Public
        protected String title;       // Protected
        private String author;        // Private

        // Constructor
        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        // Setter for author
        public void setAuthor(String author) {
            this.author = author;
        }

        // Getter for author
        public String getAuthor() {
            return author;
        }
    }

    // Subclass EBook
    static class EBook extends Book {
        private double fileSizeMB;

        public EBook(String ISBN, String title, String author, double fileSizeMB) {
            super(ISBN, title, author);
            this.fileSizeMB = fileSizeMB;
        }

        // Display method to demonstrate access to inherited fields
        public void displayDetails() {
            System.out.println("EBook ISBN: " + ISBN);        // public — accessible
            System.out.println("EBook Title: " + title);      // protected — accessible in subclass
            // System.out.println("Author: " + author);       
            System.out.println("Author: " + getAuthor());     
            System.out.println("File Size: " + fileSizeMB + " MB");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Book book = new Book("123-4567890123", "Java Fundamentals", "Alice Smith");
        System.out.println("Book ISBN: " + book.ISBN);
        System.out.println("Book Author: " + book.getAuthor());

        book.setAuthor("Alice Johnson");
        System.out.println("Updated Book Author: " + book.getAuthor());

        System.out.println();

        EBook ebook = new EBook("987-6543210987", "Learn Java Fast", "Bob Brown", 2.5);
        ebook.displayDetails();
    }
}
