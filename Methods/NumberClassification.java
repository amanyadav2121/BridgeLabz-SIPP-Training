package Methods;

public class NumberClassification {
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int[] digits = getDigits(num); // Now using local method
        int sum = 0;
        for (int d : digits) {
            sum += factorial(d);
        }
        return sum == num;
    }

    // Added this helper method to get digits
    private static int[] getDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    private static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}