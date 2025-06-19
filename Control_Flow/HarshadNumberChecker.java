import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0, temp = num;
        
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println(num % sum == 0 ? "Harshad" : "Not Harshad");
        sc.close();
    }
}