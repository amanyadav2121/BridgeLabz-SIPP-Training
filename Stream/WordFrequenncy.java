import java.io.*;
import java.util.*;

public class WordFrequenncy {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Asus\\Desktop\\sample.txt.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
            sortedList.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
                Map.Entry<String, Integer> entry = sortedList.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
