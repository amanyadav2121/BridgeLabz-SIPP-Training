package Methods;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter number %d: ", i+1);
            nums[i] = sc.nextInt();
            
            if (isPositive(nums[i])) {
                System.out.printf("%d is positive and %s%n", 
                                nums[i], isEven(nums[i]) ? "even" : "odd");
            } else {
                System.out.printf("%d is negative%n", nums[i]);
            }
        }
        sc.close();
        
        int comparison = compare(nums[0], nums[4]);
        System.out.printf("First vs Last: %s%n", 
                         comparison == 1 ? "First > Last" : 
                         comparison == 0 ? "Equal" : "First < Last");
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }
}