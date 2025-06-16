import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        System.out.println("Divisible by 5? " + (num % 5 == 0));
        sc.close();
    }
}