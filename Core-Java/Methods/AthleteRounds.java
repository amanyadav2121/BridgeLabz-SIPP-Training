package Methods;

import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();
        
        System.out.printf("Rounds needed: %.2f%n", calculateRounds(a, b, c));
        sc.close();
    }

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter; // 5km = 5000m
    }
}