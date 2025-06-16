// Volume of a Cylinder

import java.util.Scanner;

public class Volume_of_a_Cylinder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        int radius= sc.nextInt();
        System.out.println("enter height");
        int height= sc.nextInt();
        double Volume = 3.147 * radius * radius * height;
        System.out.println("Volume is "+Volume);
        sc.close();
}
}