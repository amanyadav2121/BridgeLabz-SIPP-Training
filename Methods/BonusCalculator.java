package Methods;

import java.util.Random;

public class BonusCalculator {
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonus(employeeData);
        displayResults(employeeData, bonusData);
    }

    public static double[][] generateEmployeeData(int employees) {
        Random rand = new Random();
        double[][] data = new double[employees][2];
        for (int i = 0; i < employees; i++) {
            data[i][0] = 30000 + rand.nextInt(70000); // Salary
            data[i][1] = 1 + rand.nextInt(10);       // Years of service
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] results = new double[data.length][3];
        for (int i = 0; i < data.length; i++) {
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            results[i][0] = data[i][0]; // Old salary
            results[i][1] = data[i][0] * bonusRate; // Bonus
            results[i][2] = data[i][0] + results[i][1]; // New salary
        }
        return results;
    }

    public static void displayResults(double[][] data, double[][] bonusData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f%n",
                            i+1, data[i][0], data[i][1], 
                            bonusData[i][1], bonusData[i][2]);
            
            totalOld += data[i][0];
            totalNew += bonusData[i][2];
            totalBonus += bonusData[i][1];
        }
        
        System.out.printf("Totals\t%.2f\t\t%.2f\t%.2f%n", 
                         totalOld, totalBonus, totalNew);
    }
}