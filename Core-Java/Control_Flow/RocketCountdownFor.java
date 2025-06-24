import java.util.Scanner;

public class RocketCountdownFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = sc.nextInt();
        
        for (; counter >= 1; counter--) {
            System.out.println(counter);
        }
        sc.close();
    }
}