import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);
        scanner.close();
    }
}