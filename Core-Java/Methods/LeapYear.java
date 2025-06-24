package Methods;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.close();
        
        System.out.printf("%d is %sa leap year%n", 
                         year, isLeapYear(year) ? "" : "not ");
    }

    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}