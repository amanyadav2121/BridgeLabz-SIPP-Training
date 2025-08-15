import java.io.*;

public class FileLowerCopy {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destFile   = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File conversion complete.");

        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }
}