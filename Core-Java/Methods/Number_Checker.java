package Methods;

public class Number_Checker {
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d * d;
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        if (num == 0) return false;
        int sum = sumDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        
        for (int d : digits) {
            freq[d][1]++;
        }
        
        // Filter only digits that appeared
        int count = 0;
        for (int[] f : freq) {
            if (f[1] > 0) count++;
        }
        
        int[][] result = new int[count][2];
        int index = 0;
        for (int[] f : freq) {
            if (f[1] > 0) result[index++] = f;
        }
        
        return result;
    }
}