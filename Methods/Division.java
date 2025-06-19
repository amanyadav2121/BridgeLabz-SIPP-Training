package Methods;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int num = sc.nextInt();
        System.out.print("Enter divisor: ");
        int div = sc.nextInt();
        
        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
        sc.close();
    }

    public static int[] findRemainderAndQuotient(int num, int div) {
        int[] result = new int[2];
        result[0] = num / div;  // quotient
        result[1] = num % div;  // remainder
        return result;
    }
}