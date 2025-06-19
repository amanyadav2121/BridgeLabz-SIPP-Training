import java.util.Scanner;

public class RangeMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] results = new int[4];
        
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            results[j] = num * i;
            System.out.println(num + " * " + i + " = " + results[j]);
        }
        sc.close();
    }
}