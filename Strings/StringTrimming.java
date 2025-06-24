package Strings;

import java.util.Scanner;

class StringTrimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String text = scanner.nextLine();

        int[] indexes = findTrimIndexes(text);
        String manualTrim = createSubstring(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        System.out.println("Manual trim: '" + manualTrim + "'");
        System.out.println("Built-in trim: '" + builtInTrim + "'");
        System.out.println("Are equal: " + compareStrings(manualTrim, builtInTrim));
        
        scanner.close();
    }

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        // Find first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        
        // Find last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end + 1};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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