//Calculate Simple Interest

import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Principal");
        int p= sc.nextInt();
        System.out.println("enter rate");
        int r= sc.nextInt();
        System.out.println("enter time");
        int t= sc.nextInt();
        double SimpleInterest = (p * r * t) / 100;
        System.out.println("Simple Interest " + SimpleInterest );
        sc.close();
    }
}