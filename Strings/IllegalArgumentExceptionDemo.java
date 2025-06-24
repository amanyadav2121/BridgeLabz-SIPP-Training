package Strings;
import java.util.Scanner;

class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        generateException(text);
        handleException(text);
        
        scanner.close();
    }

    public static void generateException(String text) {
        // This will throw IllegalArgumentException
        String sub = text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}