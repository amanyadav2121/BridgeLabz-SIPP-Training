import java.io.*;

public class UserInputField {
    public static void main(String[] args) {
        // Output file path (you can change it)
        String filePath = "C:\\Users\\Asus\\Desktop\\user_data.txt";

        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(filePath)
        ) {
            // Reading input from console
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Writing to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println(" Data saved successfully to " + filePath);

        } catch (IOException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
