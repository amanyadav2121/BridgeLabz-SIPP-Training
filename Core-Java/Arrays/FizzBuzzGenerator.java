import java.util.Scanner;

public class FizzBuzzGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            if (num % 15 == 0) result[i] = "FizzBuzz";
            else if (num % 3 == 0) result[i] = "Fizz";
            else if (num % 5 == 0) result[i] = "Buzz";
            else result[i] = String.valueOf(num);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }
        sc.close();
    }
}