import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double input;
        
        System.out.print("Enter numbers (0 to stop): ");
        while ((input = sc.nextDouble()) != 0) {
            total += input;
        }
        System.out.println("Total: " + total);
        sc.close();
    }
}