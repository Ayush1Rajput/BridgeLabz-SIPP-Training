package StreamAPI.StreamAPI_Method.TopTrendingMovies;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 2023, 8.2),
            new Movie("Movie B", 2022, 7.9),
            new Movie("Movie C", 2024, 9.0),
            new Movie("Movie D", 2021, 7.0),
            new Movie("Movie E", 2024, 8.7),
            new Movie("Movie F", 2023, 8.9),
            new Movie("Movie G", 2022, 8.5)
        );

        System.out.println("Top 5 Trending Movies:");
        movies.stream()
              .filter(m -> m.releaseYear >= 2022)
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed())
              .limit(5)
              .forEach(m -> System.out.println(m.name + " (" + m.releaseYear + ") Rating: " + m.rating));
    }
}
