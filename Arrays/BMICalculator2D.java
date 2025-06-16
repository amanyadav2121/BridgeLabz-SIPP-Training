import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        
        double[][] data = new double[n][3];
        String[] statuses = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) and height (m) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]); // BMI
            
            if (data[i][2] <= 18.4) statuses[i] = "Underweight";
            else if (data[i][2] <= 24.9) statuses[i] = "Normal";
            else if (data[i][2] <= 39.9) statuses[i] = "Overweight";
            else statuses[i] = "Obese";
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height=%.2fm, Weight=%.2fkg, BMI=%.2f, Status=%s\n",
                i + 1, data[i][1], data[i][0], data[i][2], statuses[i]);
        }
        sc.close();
    }
}