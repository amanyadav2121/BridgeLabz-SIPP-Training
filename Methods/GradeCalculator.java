package Methods;

import java.util.Random;

public class GradeCalculator {
    public static void main(String[] args) {
        int[][] scores = generateScores(5); // 5 students
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }

    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + rand.nextInt(90); // Physics
            scores[i][1] = 10 + rand.nextInt(90); // Chemistry
            scores[i][2] = 10 + rand.nextInt(90); // Math
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = average;
            
            results[i][0] = total;
            results[i][1] = Math.round(average * 100) / 100.0;
            results[i][2] = Math.round(percentage * 100) / 100.0;
            results[i][3] = getGrade(percentage);
        }
        return results;
    }

    public static char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        if (percentage >= 70) return 'B';
        if (percentage >= 60) return 'C';
        if (percentage >= 50) return 'D';
        if (percentage >= 40) return 'E';
        return 'R';
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%.1f\t%c%n",
                            i+1, scores[i][0], scores[i][1], scores[i][2],
                            (int)results[i][0], results[i][1], results[i][2], 
                            (char)results[i][3]);
        }
    }
}