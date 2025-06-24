package Strings;

import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        String[] names = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = scanner.next();
        }
        
        generateException(names);
        handleException(names);
        
        scanner.close();
    }

    public static void generateException(String[] names) {
        // This will throw ArrayIndexOutOfBoundsException
        String name = names[names.length];
    }

    public static void handleException(String[] names) {
        try {
            String name = names[names.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}