

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) nums[i] = sc.nextInt();
        
        for (int num : nums) {
            if (num > 0) System.out.println(num + " is positive and " + (num % 2 == 0 ? "even" : "odd"));
            else if (num < 0) System.out.println(num + " is negative");
            else System.out.println(num + " is zero");
        }
        
        if (nums[0] > nums[4]) System.out.println("First > Last");
        else if (nums[0] < nums[4]) System.out.println("First < Last");
        else System.out.println("First == Last");
        sc.close();
    }
}
