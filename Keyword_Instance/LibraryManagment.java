public class LibraryManagment {
    public static class Book {
        static String libraryName = "GLA Library";

        private String title;
        private String authorName;
        private int isbNumber;

        // Parameterized Constructor
        public Book(String title, String authorName, int isbNumber) {
            this.title = title;
            this.authorName = authorName;
            this.isbNumber = isbNumber;
        }

        // Method for display the Library name
        public static void displayLibraryName() {
            System.out.println("\nLibrary Name : " + libraryName);
        }

        // Method to display book details with instanceof check
        public void displayBookDetails() {
            // instanceof
            if (this instanceof Book) {
                System.out.println("\nLibrary Name: " + libraryName);
                System.out.println("Title: " + title);
                System.out.println("Author: " + authorName);
                System.out.println("ISBN: " + isbNumber);
            } else {
                System.out.println("Object is not a valid Book.");
            }
        }
        
    }

    public static void main(String[] args) {
        Book book = new Book("XYZ", "ABC",238778);

        book.displayBookDetails();
        
    }
}