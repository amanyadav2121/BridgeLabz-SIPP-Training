import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        
        System.out.println(sum > num ? "Abundant" : "Not abundant");
        sc.close();
    }
}