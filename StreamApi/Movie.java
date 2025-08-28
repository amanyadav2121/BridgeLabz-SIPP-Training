package com.pranav.streams;

import java.time.Year;

public class Movie {
    private final String title;
    private final double rating; // 0.0 - 10.0
    private final int releaseYear;

    public Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String getTitle() { return title; }
    public double getRating() { return rating; }
    public int getReleaseYear() { return releaseYear; }

    @Override
    public String toString() {
        return "%s (%.1f, %d)".formatted(title, rating, releaseYear);
    }
}
