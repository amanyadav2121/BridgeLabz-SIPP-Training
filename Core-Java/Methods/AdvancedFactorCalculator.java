package Methods;

public class AdvancedFactorCalculator {
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static double productCubedFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
}