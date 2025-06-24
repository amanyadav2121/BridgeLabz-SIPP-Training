import java.util.Scanner;

public class LimitedArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0;
        int count = 0;
        
        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || count == 10) break;
            arr[count++] = num;
        }
        
        for (int i = 0; i < count; i++) sum += arr[i];
        
        System.out.println("Sum: " + sum);
        sc.close();
    }
}