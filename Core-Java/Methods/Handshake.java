package Methods;

import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter students: ");
        int n = sc.nextInt();
        System.out.println("Max handshakes: " + calculateHandshakes(n));
        sc.close();
    }

    public static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }
}