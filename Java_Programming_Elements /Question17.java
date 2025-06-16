import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + (number1 + number2) + ", " + (number1 - number2) + ", " + (number1 * number2) + ", " + (number1 / number2));
        sc.close();
    }
}