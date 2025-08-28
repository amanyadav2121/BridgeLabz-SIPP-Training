package com.pranav.streams;

import java.util.*;
import java.util.stream.*;

public class TopTrendingMovies {
    // Top 5 based on rating, then by newer release year
    public static List<Movie> top5(List<Movie> movies) {
        return movies.stream()
                .filter(m -> m.getRating() >= 0) // example filter; could be any rule
                .sorted(Comparator
                        .comparingDouble(Movie::getRating).reversed()
                        .thenComparing(Movie::getReleaseYear, Comparator.reverseOrder()))
                .limit(5)
                .toList();
    }
}
