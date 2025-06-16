import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorial = 1;
        int i = 1;
        
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial: " + factorial);
        sc.close();
    }
}