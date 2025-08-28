package com.pranav.streams;

import java.util.Set;

public class Doctor {
    private final String name;
    private final String specialty;
    private final Set<String> daysAvailable; // e.g., "MON","TUE","SAT","SUN"

    public Doctor(String name, String specialty, Set<String> daysAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.daysAvailable = daysAvailable;
    }

    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
    public Set<String> getDaysAvailable() { return daysAvailable; }

    @Override
    public String toString() {
        return "%s (%s) %s".formatted(name, specialty, daysAvailable);
    }
}
