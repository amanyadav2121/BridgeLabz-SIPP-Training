package Methods;

public class NumberProperties {
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean isPalindrome(int[] digits) {
        for (int i = 0; i < digits.length / 2; i++) {
            if (digits[i] != digits[digits.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}