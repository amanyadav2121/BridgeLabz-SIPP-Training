
// Write a program that takes two numbers as input: a base and an exponent,
// and prints the result of base raised to the exponent (without using loops or
// conditionals).

import java.util.Scanner;

public class PowerCalculation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base value");
        double b= sc.nextInt();
        System.out.println("enter exponent value");
        double e= sc.nextInt();
        double power= Math.pow(b, e);
        System.out.println(b + " raised to the power " + e + " is " + power);
        sc.close();
    }
}
