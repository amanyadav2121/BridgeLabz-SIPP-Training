package Strings;

import java.util.Scanner;
import java.util.Random;

class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        int[] ages = generateAges(n);
        String[][] eligibilityData = checkVotingEligibility(ages);
        displayResults(eligibilityData);
        
        scanner.close();
    }

    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(50) + 10; // Ages between 10-59
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can vote";
            } else {
                result[i][1] = "Cannot vote";
            }
        }
        return result;
    }

    public static void displayResults(String[][] data) {
        System.out.println("\n+--------+--------------+");
        System.out.println("| Age    | Eligibility  |");
        System.out.println("+--------+--------------+");
        
        for (String[] row : data) {
            System.out.printf("| %6s | %-12s |\n", row[0], row[1]);
        }
        
        System.out.println("+--------+--------------+");
    }
}