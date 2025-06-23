import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replaceAll("\s", "").toLowerCase();
        String s2 = sc.nextLine().replaceAll("\s", "").toLowerCase();
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        sc.close();
    }
}