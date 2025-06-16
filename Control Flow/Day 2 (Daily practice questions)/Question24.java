import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and power: ");
        int num = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        
        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}