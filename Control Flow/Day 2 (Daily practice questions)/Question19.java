import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (<100): ");
        int num = sc.nextInt();
        int counter = num;
        
        while (counter < 100) {
            if (counter % num == 0) {
                System.out.println(counter);
            }
            counter += num;
        }
        sc.close();
    }
}