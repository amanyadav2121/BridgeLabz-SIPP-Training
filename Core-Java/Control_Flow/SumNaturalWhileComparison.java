import java.util.Scanner;

public class SumNaturalWhileComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int formulaSum = n * (n + 1) / 2;
        int loopSum = 0;
        int i = 1;
        
        while (i <= n) {
            loopSum += i;
            i++;
        }
        
        System.out.println("Match: " + (formulaSum == loopSum));
        sc.close();
    }
}