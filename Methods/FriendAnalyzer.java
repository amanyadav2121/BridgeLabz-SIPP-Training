package Methods;

import java.util.Scanner;

public class FriendAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter %s's age: ", names[i]);
            ages[i] = sc.nextInt();
            System.out.printf("Enter %s's height: ", names[i]);
            heights[i] = sc.nextDouble();
        }
        sc.close();
        
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
        
        System.out.printf("Youngest: %s (%d years)%n", 
                         names[youngestIndex], ages[youngestIndex]);
        System.out.printf("Tallest: %s (%.1f cm)%n", 
                         names[tallestIndex], heights[tallestIndex]);
    }

    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }
}