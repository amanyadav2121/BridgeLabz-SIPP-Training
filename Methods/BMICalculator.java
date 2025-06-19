package Methods;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double[][] data = new double[10][3];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Enter weight (kg): ", i+1);
            data[i][0] = sc.nextDouble();
            System.out.printf("Person %d - Enter height (cm): ", i+1);
            data[i][1] = sc.nextDouble();
        }
        sc.close();
        
        calculateBMI(data);
        String[] statuses = getBMIStatus(data);
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - BMI: %.1f, Status: %s%n", 
                            i+1, data[i][2], statuses[i]);
        }
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightM = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightM * heightM);
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) statuses[i] = "Underweight";
            else if (bmi <= 24.9) statuses[i] = "Normal";
            else if (bmi <= 39.9) statuses[i] = "Overweight";
            else statuses[i] = "Obese";
        }
        return statuses;
    }
}