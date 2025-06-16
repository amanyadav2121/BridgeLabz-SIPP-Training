import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number and power: ");
        int num = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;
        
        while (counter < power) {
            result *= num;
            counter++;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}