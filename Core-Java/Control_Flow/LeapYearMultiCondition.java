import java.util.Scanner;

public class LeapYearMultiCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        if (year < 1582) {
            System.out.println("Not leap year");
        } else if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
        sc.close();
    }
}