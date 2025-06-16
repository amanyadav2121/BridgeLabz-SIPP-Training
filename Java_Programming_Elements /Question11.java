import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close();
    }
}