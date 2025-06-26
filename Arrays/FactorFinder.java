

import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        int[] factors = new int[num];
        int count = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[count++] = i;
        }
        
        System.out.print("Factors: ");
        for (int i = 0; i < count; i++) System.out.print(factors[i] + " ");
        sc.close();
    }
}