package com.pranav.streams;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExamples {

    // 1) Stock Price Logger - prints all prices from a feed
    public static void logStockPrices(List<Double> prices) {
        prices.forEach(price -> System.out.println("Stock update: " + price));
    }

    // 2) Event Attendee Welcome Message
    public static void welcomeAttendees(List<String> attendees) {
        attendees.forEach(name -> System.out.println("Welcome, " + name + "!"));
    }

    // 3) IoT Sensor Readings above threshold
    public static void printSensorReadingsAbove(List<Double> readings, double threshold) {
        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("Sensor reading: " + r));
    }

    // 4) Email Notifications (mock send)
    public static void sendEmailNotifications(List<String> emails) {
        Consumer<String> sendEmail = email -> System.out.println("Email sent to: " + email);
        emails.forEach(sendEmail);
    }

    // 5) Logging Transactions with timestamp
    public static void logTransactions(List<String> transactionIds) {
        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
