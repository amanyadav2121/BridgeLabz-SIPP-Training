package Strings;

import java.util.Scanner;

class WordsWithLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordsWithLengths = createWordsWithLengths(words);
        displayTable(wordsWithLengths);
        
        scanner.close();
    }

    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start);
        
        return words;
    }

    public static String[][] createWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static int getStringLength(String s) {
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    public static void displayTable(String[][] data) {
        System.out.println("+------------+--------+");
        System.out.println("| Word       | Length |");
        System.out.println("+------------+--------+");
        
        for (String[] row : data) {
            System.out.printf("| %-10s | %6d |\n", row[0], Integer.parseInt(row[1]));
        }
        
        System.out.println("+------------+--------+");
    }
}