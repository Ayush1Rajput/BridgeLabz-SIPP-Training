

public class LibraryManagementSystem {

    static class Book {
        String title;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        Book prev;
        Book next;

        public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
        }
    }

    private Book head;
    private Book tail;

    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }

        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newBook.next = current.next;
        newBook.prev = current;
        if (current.next != null) {
            current.next.prev = newBook;
        } else {
            tail = newBook;
        }
        current.next = newBook;
    }

    public void removeByBookId(int bookId) {
        Book current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Book with ID " + bookId + " removed successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found.");
    }

    public void searchBook(String key) {
        boolean found = false;
        Book current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(key) || current.author.equalsIgnoreCase(key)) {
                displayBook(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No book found with the given search key.");
        }
    }

    public void updateAvailability(int bookId, boolean isAvailable) {
        Book current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                System.out.println("Availability status updated for book ID " + bookId);
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Books in Library (Forward Order):");
        Book current = head;
        while (current != null) {
            displayBook(current);
            current = current.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Books in Library (Reverse Order):");
        Book current = tail;
        while (current != null) {
            displayBook(current);
            current = current.prev;
        }
    }

    public void countBooks() {
        int count = 0;
        Book current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Total number of books in the library: " + count);
    }

    private void displayBook(Book book) {
        System.out.println("Book ID: " + book.bookId);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Genre: " + book.genre);
        System.out.println("Available: " + (book.isAvailable ? "Yes" : "No"));
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding sample books
        library.addAtBeginning("1984", "George Orwell", "Dystopian", 101, true);
        library.addAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 102, true);
        library.addAtEnd("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 103, false);
        library.addAtPosition(2, "Brave New World", "Aldous Huxley", "Science Fiction", 104, true);

        // Display books
        library.displayForward();
        library.displayReverse();

        // Search by author
        System.out.println("\nSearching books by 'George Orwell':");
        library.searchBook("George Orwell");

        // Update availability
        System.out.println("\nUpdating availability of Book ID 103:");
        library.updateAvailability(103, true);
        library.displayForward();

        // Remove a book by Book ID
        System.out.println("\nRemoving book with ID 104:");
        library.removeByBookId(104);
        library.displayForward();

        // Count total books
        System.out.println("\nCounting total books in the library:");
        library.countBooks();
    }
}
