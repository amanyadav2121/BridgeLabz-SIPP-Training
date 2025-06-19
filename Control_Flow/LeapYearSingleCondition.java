import java.util.Scanner;

public class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        boolean isLeap = (year >= 1582) && 
                        ((year % 400 == 0) || 
                        (year % 100 != 0 && year % 4 == 0));
        
        System.out.println(isLeap ? "Leap year" : "Not leap year");
        sc.close();
    }
}