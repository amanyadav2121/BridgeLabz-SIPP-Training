import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("The person can vote.");
        } else {
            System.out.println("The person cannot vote.");
        }
        sc.close();
    }
}