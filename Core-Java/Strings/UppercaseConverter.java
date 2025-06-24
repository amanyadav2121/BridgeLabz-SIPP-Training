package Strings;

import java.util.Scanner;

class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String manualUpper = toUppercase(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Manual uppercase: " + manualUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Are equal: " + compareStrings(manualUpper, builtInUpper));
        
        scanner.close();
    }

    public static String toUppercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            result.append(c);
        }
        return result.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}