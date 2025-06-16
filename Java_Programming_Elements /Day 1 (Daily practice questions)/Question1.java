import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double inches = height / 2.54;
        int feet = (int)(inches / 12);
        double remainingInches = inches % 12;
        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + String.format("%.2f", remainingInches));
        sc.close();
    }
}