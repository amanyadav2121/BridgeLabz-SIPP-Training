import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] digits = new int[10];
        int count = 0;
        
        while (num != 0) {
            digits[count++] = num % 10;
            num /= 10;
        }
        
        System.out.print("Reversed: ");
        for (int i = 0; i < count; i++) System.out.print(digits[i]);
        sc.close();
    }
}