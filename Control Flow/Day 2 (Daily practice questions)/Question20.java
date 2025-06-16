import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd"));
        }
        sc.close();
    }
}