import java.util.Scanner;

public class AthleteRoundsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of triangle (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of triangle (in meters): ");
        double side3 = scanner.nextDouble();
        
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        
        System.out.println("The total number of rounds the athlete will run is " + 
                         Math.round(rounds) + " to complete 5 km");
        scanner.close();
    }
}