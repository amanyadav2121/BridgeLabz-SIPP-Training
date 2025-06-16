import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int greatest = 1;
        int counter = num - 1;
        
        while (counter >= 1) {
            if (num % counter == 0) {
                greatest = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor: " + greatest);
        sc.close();
    }
}