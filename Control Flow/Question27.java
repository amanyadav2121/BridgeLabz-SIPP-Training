import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ages (Amar Akbar Anthony): ");
        int aAge = sc.nextInt();
        int bAge = sc.nextInt();
        int cAge = sc.nextInt();
        
        System.out.print("Enter heights: ");
        double aHeight = sc.nextDouble();
        double bHeight = sc.nextDouble();
        double cHeight = sc.nextDouble();
        
        String youngest = (aAge <= bAge && aAge <= cAge) ? "Amar" :
                         (bAge <= aAge && bAge <= cAge) ? "Akbar" : "Anthony";
                         
        String tallest = (aHeight >= bHeight && aHeight >= cHeight) ? "Amar" :
                       (bHeight >= aHeight && bHeight >= cHeight) ? "Akbar" : "Anthony";
        
        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
        sc.close();
    }
}