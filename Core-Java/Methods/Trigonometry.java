package Methods;

public class Trigonometry {
    public static void main(String[] args) {
        double angle = 45.0;
        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.2f, Cosine: %.2f, Tangent: %.2f%n", 
                         results[0], results[1], results[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[] {
            Math.sin(radians),
            Math.cos(radians),
            Math.tan(radians)
        };
    }
}