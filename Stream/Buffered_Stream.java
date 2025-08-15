import java.io.*;

public class Buffered_Stream {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Asus\\Desktop\\input_large_file.txt";
        String outputBuffered = "C:\\Users\\Asus\\Desktop\\output_buffered.txt";
        String outputUnbuffered = "C:\\Users\\Asus\\Desktop\\output_unbuffered.txt";

        copyWithBufferedStreams(inputFile, outputBuffered);
        copyWithUnbufferedStreams(inputFile, outputUnbuffered);
    }

    // 📍 Buffered Stream
    public static void copyWithBufferedStreams(String input, String output) {
        long start = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output))) {

            byte[] buffer = new byte[4096]; // 4KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println(" Buffered Copy Completed.");

        } catch (IOException e) {
            System.out.println("Buffered Error: " + e.getMessage());
        }

        long end = System.nanoTime();
        System.out.println("Buffered Stream Time: " + (end - start) / 1_000_000 + " ms");
    }

    //  Unbuffered Stream
    public static void copyWithUnbufferedStreams(String input, String output) {
        long start = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(input);
             FileOutputStream fos = new FileOutputStream(output)) {

            byte[] buffer = new byte[4096]; // still use buffer to keep comparison fair
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println(" Unbuffered Copy Completed.");

        } catch (IOException e) {
            System.out.println("Unbuffered Error: " + e.getMessage());
        }

        long end = System.nanoTime();
        System.out.println("Unbuffered Stream Time: " + (end - start) / 1_000_000 + " ms");
    }
}
