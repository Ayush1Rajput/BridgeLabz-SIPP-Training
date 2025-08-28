package Collector.LibraryBookStatistics;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book1", "Fiction", 300),
            new Book("Book2", "Fiction", 450),
            new Book("Book3", "Science", 500),
            new Book("Book4", "Science", 250),
            new Book("Book5", "History", 600)
        );

        Map<String, IntSummaryStatistics> stats = books.stream()
            .collect(Collectors.groupingBy(Book::getGenre,
                    Collectors.summarizingInt(Book::getPages)));

        stats.forEach((genre, stat) -> {
            System.out.println(genre + " => " + stat);
        });
    }
}
