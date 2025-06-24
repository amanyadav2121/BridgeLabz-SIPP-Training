package Methods;

import java.util.Scanner;

public class RecursiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        
        System.out.printf("Recursive sum: %d, Formula sum: %d%n", 
                         recursiveSum, formulaSum);
        System.out.println("Match: " + (recursiveSum == formulaSum));
    }

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}