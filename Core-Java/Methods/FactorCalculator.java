package Methods;

import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        
        int[] factors = getFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        
        System.out.printf("%nSum: %d, Sum of squares: %d, Product: %d%n",
                         sumFactors(factors), 
                         sumSquares(factors),
                         productFactors(factors));
    }

    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int sumSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f * f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }
}