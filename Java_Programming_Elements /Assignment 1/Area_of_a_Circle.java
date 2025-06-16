//Area of a Circle

import java.util.Scanner;

public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius= sc.nextInt();
        double Area = 3.147 * (radius*radius);
        System.out.println("area is "+Area);
    sc.close();
    }
}
