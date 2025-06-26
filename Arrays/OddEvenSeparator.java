import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] evens = new int[n / 2 + 1];
        int[] odds = new int[n / 2 + 1];
        int e = 0, o = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                evens[e++] = i;
            else
                odds[o++] = i;
        }

        System.out.print("Evens: ");
        for (int i = 0; i < e; i++)
            System.out.print(evens[i] + " ");

        System.out.print("\nOdds: ");
        for (int i = 0; i < o; i++)
            System.out.print(odds[i] + " ");
        
        // No need to close sc when using System.in in small programs
    }
}
