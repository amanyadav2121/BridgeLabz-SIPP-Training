package Strings;
import java.util.Scanner;

class LowercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String manualLower = toLowercase(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Manual lowercase: " + manualLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Are equal: " + compareStrings(manualLower, builtInLower));
        
        scanner.close();
    }

    public static String toLowercase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
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