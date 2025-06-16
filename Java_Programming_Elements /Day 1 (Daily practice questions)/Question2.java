import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        double miles = km / 1.6;
        System.out.println("The total miles is " + String.format("%.2f", miles) + " mile for the given " + km + " km");
        input.close();
    }
}