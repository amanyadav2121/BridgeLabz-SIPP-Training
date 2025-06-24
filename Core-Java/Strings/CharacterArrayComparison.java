package Strings;

import java.util.Scanner;

class CharacterArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] manualArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Manual array matches built-in: " + compareArrays(manualArray, builtInArray));
        
        scanner.close();
    }

    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}