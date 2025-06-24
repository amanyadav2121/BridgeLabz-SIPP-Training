package Methods;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (years): ");
        double time = sc.nextDouble();
        
        double interest = calculateInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f",
                          interest, principal, rate, time);
        sc.close();
    }

    public static double calculateInterest(double p, double r, double t) {
        return p * r * t / 100;
    }
}