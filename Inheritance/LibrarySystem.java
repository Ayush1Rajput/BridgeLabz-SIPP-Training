// Superclass: Book
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("---- Book Details ----");
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (extends Book)
class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo() to include author details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class 
public class LibrarySystem {
    public static void main(String[] args) {
        Author book = new Author(
            "To Kill a Mockingbird",
            1960,
            "Harper Lee",
            "XYZ."
        );

        book.displayInfo();
    }
}
