package Strings;

import java.util.Scanner;

class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        int manualLength = getStringLength(text);
        int builtInLength = text.length();
        
        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtInLength);
        System.out.println("Results match: " + (manualLength == builtInLength));
        
        scanner.close();
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
}