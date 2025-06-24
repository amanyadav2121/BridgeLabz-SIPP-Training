import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] employees = new double[10][2]; // [salary, years]
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary and years for employee " + (i + 1) + ": ");
            employees[i][0] = sc.nextDouble();
            employees[i][1] = sc.nextDouble();
            
            if (employees[i][0] <= 0 || employees[i][1] < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }
            
            totalOld += employees[i][0];
        }
        
        for (int i = 0; i < 10; i++) {
            if (employees[i][1] > 5) bonuses[i] = employees[i][0] * 0.05;
            else bonuses[i] = employees[i][0] * 0.02;
            
            newSalaries[i] = employees[i][0] + bonuses[i];
            totalBonus += bonuses[i];
            totalNew += newSalaries[i];
        }
        
        System.out.printf("Total bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total old salary: %.2f\n", totalOld);
        System.out.printf("Total new salary: %.2f\n", totalNew);
        sc.close();
    }
}