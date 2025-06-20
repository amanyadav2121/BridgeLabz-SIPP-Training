import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers and operator (+, -, *, /): ");
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();
        
        switch(op) {
            case "+": System.out.println(first + second); break;
            case "-": System.out.println(first - second); break;
            case "*": System.out.println(first * second); break;
            case "/": System.out.println(first / second); break;
            default: System.out.println("Invalid Operator");
        }
        sc.close();
    }
}