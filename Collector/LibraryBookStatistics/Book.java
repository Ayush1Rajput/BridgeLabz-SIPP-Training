package Collector.LibraryBookStatistics;

public class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }
}