import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + String.format("%.2f", areaInch) + " and sq cm is " + String.format("%.2f", areaCm));
        sc.close();
    }
}