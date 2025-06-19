package Strings;

import java.util.Scanner;

class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        generateException(text);
        handleException(text);
        
        scanner.close();
    }

    public static void generateException(String text) {
        // This will throw StringIndexOutOfBoundsException
        char c = text.charAt(text.length() + 1);
    }

    public static void handleException(String text) {
        try {
            char c = text.charAt(text.length() + 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}