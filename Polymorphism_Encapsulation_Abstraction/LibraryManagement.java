import java.util.ArrayList;
import java.util.List;

// Abstract Class
abstract class LibraryItem{
    private String itemID;
    private String title;
    private String author;

    // Parametirized Constructor
    public LibraryItem(String itemID, String title , String author ){
        this.title = title;
        this.itemID = itemID;
        this.author = author;
    }

    // Getter and Setter methods (Encapsulation)
    public String getItemId() {
        return itemID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setItemId(String itemId) {
        this.itemID = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // abstract method
    abstract int getLoanDuration();

    // Concrete method for getting details 
    public void getItemDetails(){
        System.out.println("\n---- Item Details ----");
        System.out.println("Item Id : " + itemID);
        System.out.println("Title name : " + title);
        System.out.println("Author name : "+ author);
    }
}

// Book class extends LibraryItem
class Book extends LibraryItem {
    private String genre;

    public Book(String itemId, String title, String author, String genre) {
        super(itemId, title, author);
        this.genre = genre;
    }

    @Override
    int getLoanDuration() {
        return 14;  // Books can be loaned for 14 days
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

// Magazine class extends LibraryItem
class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    int getLoanDuration() {
        return 7;  // Magazines can be loaned for 7 days
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}

// DVD class extends LibraryItem
class DVD extends LibraryItem {
    private String director;

    public DVD(String itemId, String title, String author, String director) {
        super(itemId, title, author);
        this.director = director;
    }

    @Override
    int getLoanDuration() {
        return 3;  // DVDs can be loaned for 3 days
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

// Reservable interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Book, Magazine, and DVD implement Reservable interface
class ReservableBook extends Book implements Reservable {
    private boolean isAvailable;

    public ReservableBook(String itemId, String title, String author, String genre, boolean isAvailable) {
        super(itemId, title, author, genre);
        this.isAvailable = isAvailable;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Item reserved by: " + borrowerName);
        } else {
            System.out.println("Item is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class ReservableMagazine extends Magazine implements Reservable {
    private boolean isAvailable;

    public ReservableMagazine(String itemId, String title, String author, int issueNumber, boolean isAvailable) {
        super(itemId, title, author, issueNumber);
        this.isAvailable = isAvailable;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Item reserved by: " + borrowerName);
        } else {
            System.out.println("Item is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class ReservableDVD extends DVD implements Reservable {
    private boolean isAvailable;

    public ReservableDVD(String itemId, String title, String author, String director, boolean isAvailable) {
        super(itemId, title, author, director);
        this.isAvailable = isAvailable;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Item reserved by: " + borrowerName);
        } else {
            System.out.println("Item is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
        // Create a list of library items
        List<LibraryItem> libraryItems = new ArrayList<>();

        // Adding books, magazines, and DVDs to the library
        libraryItems.add(new Book("B001", "Harry Potter", "J.K. Rowling", "Fantasy"));
        libraryItems.add(new Magazine("M002", "Time Magazine", "Time Inc.", 2023));
        libraryItems.add(new DVD("D003", "Inception", "Christopher Nolan", "Christopher Nolan"));

        // Adding reservable items
        libraryItems.add(new ReservableBook("B004", "Java Programming", "Herbert Schildt", "Tech", true));
        libraryItems.add(new ReservableMagazine("M005", "National Geographic", "NG", 2023, true));
        libraryItems.add(new ReservableDVD("D006", "The Dark Knight", "Christopher Nolan", "Christopher Nolan", true));

        // Demonstrating polymorphism: process different items
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Check availability and reserve the item
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Is Available: " + reservableItem.checkAvailability());
                reservableItem.reserveItem("Alice");
                System.out.println("Is Available: " + reservableItem.checkAvailability());
            }

            System.out.println();
        }
    }
}
