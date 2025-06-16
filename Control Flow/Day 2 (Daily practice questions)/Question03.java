import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("Is first smallest? " + (a < b && a < c));
        sc.close();
    }
}