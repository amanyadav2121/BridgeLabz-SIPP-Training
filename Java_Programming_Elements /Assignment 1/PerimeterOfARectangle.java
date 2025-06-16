//Perimeter of a Rectangle

import java.util.Scanner;

public class PerimeterOfARectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter length");
        int length= sc.nextInt();

        System.out.println("enter width");
        int width= sc.nextInt();

        double Perimeter = 2 * (length + width);

        System.out.println("Perimeter is " + Perimeter );
        sc.close();
}
}
