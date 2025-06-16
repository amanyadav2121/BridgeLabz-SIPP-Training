// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.*;

public class triangleArea_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("The area of triangle in square inches is " + areaInInches + " and in square centimeters is " + areaInCm);
        sc.close();
    }
}
