package Strings;

import java.util.Scanner;

class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean manualCompare = compareStrings(str1, str2);
        boolean builtInCompare = str1.equals(str2);

        System.out.println("Manual comparison: " + manualCompare);
        System.out.println("Built-in comparison: " + builtInCompare);
        System.out.println("Results match: " + (manualCompare == builtInCompare));
        
        scanner.close();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}