import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int cmp = s1.compareTo(s2);
        if (cmp < 0) System.out.println(s1 + " comes before " + s2);
        else if (cmp > 0) System.out.println(s2 + " comes before " + s1);
        else System.out.println("Both strings are equal");
        sc.close();
    }
}