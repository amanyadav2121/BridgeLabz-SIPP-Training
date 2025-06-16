import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary and years: ");
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        
        if (years > 5) {
            System.out.println("Bonus: " + (salary * 0.05));
        } else {
            System.out.println("No bonus");
        }
        sc.close();
    }
}