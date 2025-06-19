package Methods;

import java.util.Scanner;

public class VotingChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter age for student %d: ", i+1);
            ages[i] = sc.nextInt();
            
            boolean canVote = canStudentVote(ages[i]);
            System.out.printf("Student %d: %s%n", i+1, 
                            canVote ? "Can vote" : "Cannot vote");
        }
        sc.close();
    }

    public static boolean canStudentVote(int age) {
        return age >= 18;
    }
}