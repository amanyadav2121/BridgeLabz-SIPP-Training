package Methods;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int choc = sc.nextInt();
        System.out.print("Enter children: ");
        int children = sc.nextInt();
        
        int[] result = distributeChocolates(choc, children);
        System.out.printf("Each gets %d, %d remaining%n", result[0], result[1]);
        sc.close();
    }

    public static int[] distributeChocolates(int choc, int children) {
        return new int[]{choc / children, choc % children};
    }
}