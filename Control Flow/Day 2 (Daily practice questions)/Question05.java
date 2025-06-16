import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("Is first largest? " + (a > b && a > c));
        System.out.println("Is second largest? " + (b > a && b > c));
        System.out.println("Is third largest? " + (c > a && c > b));
        sc.close();
    }
}