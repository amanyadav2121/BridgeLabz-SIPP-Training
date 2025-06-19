package Methods;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots");
        } else if (roots.length == 1) {
            System.out.printf("Single root: %.2f%n", roots[0]);
        } else {
            System.out.printf("Roots: %.2f and %.2f%n", roots[0], roots[1]);
        }
    }

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) return new double[0];
        if (delta == 0) return new double[]{-b / (2 * a)};
        
        double sqrtDelta = Math.sqrt(delta);
        return new double[]{
            (-b - sqrtDelta) / (2 * a),
            (-b + sqrtDelta) / (2 * a)
        };
    }
}