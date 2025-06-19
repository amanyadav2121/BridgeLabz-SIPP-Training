package Strings;

import java.util.Scanner;

class VowelConsonantIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] charTypes = identifyCharacters(text);
        displayTable(charTypes);
        
        scanner.close();
    }

    public static String[][] identifyCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharacterType(c);
        }
        return result;
    }

    public static String checkCharacterType(char c) {
        // Convert to lowercase if uppercase
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }
        
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static void displayTable(String[][] data) {
        System.out.println("+------------+---------------+");
        System.out.println("| Character  | Type          |");
        System.out.println("+------------+---------------+");
        
        for (String[] row : data) {
            System.out.printf("| %-10s | %-13s |\n", row[0], row[1]);
        }
        
        System.out.println("+------------+---------------+");
    }
}