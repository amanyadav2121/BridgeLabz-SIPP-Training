import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0, original = num;
        
        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original /= 10;
        }
        
        System.out.println(num == sum ? "Armstrong" : "Not Armstrong");
        sc.close();
    }
}