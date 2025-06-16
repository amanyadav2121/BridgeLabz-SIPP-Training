import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feet = sc.nextInt();
        double yards = feet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("The distance in yards is " + String.format("%.2f", yards) + " while the distance in miles is " + String.format("%.2f", miles));
        sc.close();
    }
}