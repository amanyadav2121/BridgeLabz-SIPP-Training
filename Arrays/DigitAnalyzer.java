import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] digits = new int[10];
        int count = 0;
        
        while (num != 0 && count < 10) {
            digits[count++] = num % 10;
            num /= 10;
        }
        
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (digits[i] > max1) {
                max2 = max1;
                max1 = digits[i];
            } else if (digits[i] > max2) {
                max2 = digits[i];
            }
        }
        
        System.out.println("Largest: " + max1 + ", Second largest: " + max2);
        sc.close();
    }
}
