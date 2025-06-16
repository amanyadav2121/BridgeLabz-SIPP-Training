import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        boolean isSpring = (month == 3 && day >= 20) || 
                          (month > 3 && month < 6) || 
                          (month == 6 && day <= 20);
        
        System.out.println(isSpring ? "Spring Season" : "Not Spring Season");
        sc.close();
    }
}