import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month day year: ");
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();
        
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31*m0/12) % 7;
        
        System.out.println("Day: " + d0);
        sc.close();
    }
}