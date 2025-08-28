package com.pranav.streams;

import java.time.LocalDate;

public class Member {
    private final String name;
    private final LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() { return name; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return "%s (expires %s)".formatted(name, expiryDate);
    }
}
