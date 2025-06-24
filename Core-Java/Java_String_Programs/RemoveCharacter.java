import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        String result = str.replaceAll(String.valueOf(ch), "");
        System.out.println("Modified: " + result);
        sc.close();
    }
}