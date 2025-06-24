import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int max = 0;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }
        System.out.println("Most Frequent: " + result);
        sc.close();
    }
}