package Methods;

public class RandomAnalyzer {
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        double[] stats = findAverageMinMax(numbers);
        
        System.out.println("Numbers:");
        for (int num : numbers) System.out.print(num + " ");
        
        System.out.printf("%nAverage: %.1f, Min: %d, Max: %d%n", 
                         stats[0], (int)stats[1], (int)stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = 1000 + (int)(Math.random() * 9000);
        }
        return nums;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new double[]{(double)sum/numbers.length, min, max};
    }
}