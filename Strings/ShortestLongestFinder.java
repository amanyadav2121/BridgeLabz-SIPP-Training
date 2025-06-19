package Strings;

import java.util.Scanner;

class ShortestLongestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordsWithLengths = createWordsWithLengths(words);
        int[] minMax = findShortestAndLongest(wordsWithLengths);

        System.out.println("Shortest word: " + words[minMax[0]] + " (length: " + minMax[1] + ")");
        System.out.println("Longest word: " + words[minMax[2]] + " (length: " + minMax[3] + ")");
        
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

    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortestIndex = 0;
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestIndex = 0;
        int longestLength = shortestLength;
        
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }
        
        return new int[]{shortestIndex, shortestLength, longestIndex, longestLength};
    }
}