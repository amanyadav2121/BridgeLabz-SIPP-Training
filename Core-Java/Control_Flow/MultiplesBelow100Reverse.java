import java.util.Scanner;

public class MultiplesBelow100Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (<100): ");
        int num = sc.nextInt();
        
        for (int i = 100; i >= 1; i--) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}