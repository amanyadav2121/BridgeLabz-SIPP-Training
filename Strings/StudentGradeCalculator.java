package Strings;

import java.util.Scanner;
import java.util.Random;

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        
        int[][] scores = generateScores(n);
        double[][] averages = calculateAverages(scores);
        String[][] grades = calculateGrades(averages);
        displayScorecard(scores, averages, grades);
        
        scanner.close();
    }

    public static int[][] generateScores(int n) {
        Random random = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = random.nextInt(50) + 50; // Physics (50-99)
            scores[i][1] = random.nextInt(50) + 50; // Chemistry (50-99)
            scores[i][2] = random.nextInt(50) + 50; // Math (50-99)
        }
        return scores;
    }

    public static double[][] calculateAverages(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            // Round to 2 decimal places
            result[i][0] = Math.round(total * 100) / 100.0;
            result[i][1] = Math.round(average * 100) / 100.0;
            result[i][2] = Math.round(percentage * 100) / 100.0;
        }
        return result;
    }

    public static String[][] calculateGrades(double[][] averages) {
        String[][] grades = new String[averages.length][1];
        for (int i = 0; i < averages.length; i++) {
            double percentage = averages[i][2];
            
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] averages, String[][] grades) {
        System.out.println("\n+-----+----------+-----------+-----+-------+-----------+-----------+");
        System.out.println("| No. | Physics  | Chemistry | Math | Total | Average   | Percentage| Grade |");
        System.out.println("+-----+----------+-----------+-----+-------+-----------+-----------+");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("| %3d | %8d | %9d | %4d | %5.0f | %9.2f | %9.2f | %5s |\n",
                            i+1, 
                            scores[i][0], scores[i][1], scores[i][2],
                            averages[i][0], averages[i][1], averages[i][2],
                            grades[i][0]);
        }
        
        System.out.println("+-----+----------+-----------+-----+-------+-----------+-----------+");
    }
}