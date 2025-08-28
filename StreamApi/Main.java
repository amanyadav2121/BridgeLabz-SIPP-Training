package com.pranav.streams;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        demoTopTrendingMovies();
        demoHospitalDoctorAvailability();
        demoInsuranceClaimAnalysis();
        demoExpiringMemberships();
        demoTransformingNames();
        demoForEachExamples();
    }

    private static void demoTopTrendingMovies() {
        System.out.println("\n=== Top 5 Trending Movies ===");
        List<Movie> movies = List.of(
                new Movie("Echoes", 8.7, 2024),
                new Movie("Nebula", 9.1, 2023),
                new Movie("Aurora", 8.9, 2025),
                new Movie("Voyager", 9.1, 2021),
                new Movie("Pulse", 7.9, 2025),
                new Movie("Quantum Drift", 9.3, 2022),
                new Movie("Solstice", 8.6, 2025),
                new Movie("Zenith", 8.8, 2020)
        );
        TopTrendingMovies.top5(movies).forEach(System.out::println);
    }

    private static void demoHospitalDoctorAvailability() {
        System.out.println("\n=== Weekend Doctors (sorted by specialty) ===");
        List<Doctor> doctors = List.of(
                new Doctor("Dr. Rao", "Cardiology", Set.of("MON","TUE","SAT")),
                new Doctor("Dr. Mehta", "Neurology", Set.of("WED","THU")),
                new Doctor("Dr. Kapoor", "Orthopedics", Set.of("SAT","SUN")),
                new Doctor("Dr. Iyer", "Cardiology", Set.of("SUN")),
                new Doctor("Dr. Singh", "Dermatology", Set.of("FRI","SAT","SUN"))
        );
        HospitalDoctorAvailability.weekendDoctorsSorted(doctors).forEach(System.out::println);
    }

    private static void demoInsuranceClaimAnalysis() {
        System.out.println("\n=== Average Claim Amount by Type ===");
        List<InsuranceClaim> claims = List.of(
                new InsuranceClaim("HEALTH", 12500.0),
                new InsuranceClaim("AUTO", 5600.0),
                new InsuranceClaim("HEALTH", 9800.0),
                new InsuranceClaim("HOME", 23000.0),
                new InsuranceClaim("AUTO", 7400.0)
        );
        InsuranceClaimAnalysis.averageAmountByType(claims)
                .forEach((type, avg) -> System.out.println(type + " -> " + String.format("%.2f", avg)));
    }

    private static void demoExpiringMemberships() {
        System.out.println("\n=== Memberships expiring in next 30 days ===");
        List<Member> members = List.of(
                new Member("Aarav", LocalDate.now().plusDays(3)),
                new Member("Diya", LocalDate.now().plusDays(45)),
                new Member("Karan", LocalDate.now().plusDays(15)),
                new Member("Riya", LocalDate.now().minusDays(2)),
                new Member("Ishaan", LocalDate.now().plusDays(28))
        );
        ExpiringMemberships.expiringWithin(members, 30).forEach(System.out::println);
    }

    private static void demoTransformingNames() {
        System.out.println("\n=== Transforming Names (uppercase + sorted) ===");
        List<String> names = List.of("priya", "aman", "Zoya", "bhavesh");
        TransformingNames.transformAndSort(names).forEach(System.out::println);
    }

    private static void demoForEachExamples() {
        System.out.println("\n=== forEach Examples ===");
        // 1) Stock prices
        ForEachExamples.logStockPrices(List.of(101.2, 102.8, 100.9));

        // 2) Welcome attendees
        ForEachExamples.welcomeAttendees(List.of("Neha", "Rohit", "Sara"));

        // 3) IoT sensor readings above threshold
        ForEachExamples.printSensorReadingsAbove(List.of(31.2, 28.5, 35.0, 26.7), 30.0);

        // 4) Email notifications (mock)
        ForEachExamples.sendEmailNotifications(List.of("user1@example.com", "user2@example.com"));

        // 5) Log transactions
        ForEachExamples.logTransactions(List.of("TXN-1001", "TXN-1002", "TXN-1003"));
    }
}
