package Strings;

import java.util.Scanner;

class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as text: ");
        String text = scanner.next();
        
        generateException(text);
        handleException(text);
        
        scanner.close();
    }

    public static void generateException(String text) {
        // This will throw NumberFormatException
        int number = Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}