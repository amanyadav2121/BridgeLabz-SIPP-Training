import java.util.Scanner;

public class Convert_kilometers_to_Miles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the valus in kilometers");
        int k = sc.nextInt();

        double miles= k * 0.621371;
        
        System.out.println(k+" is in miles= "+ miles );
        sc.close();
    }
}
