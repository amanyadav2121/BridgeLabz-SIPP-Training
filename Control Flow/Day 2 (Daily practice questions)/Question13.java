import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        
        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();
            if (num <= 0) break;
            total += num;
        }
        System.out.println("Total: " + total);
        sc.close();
    }
}