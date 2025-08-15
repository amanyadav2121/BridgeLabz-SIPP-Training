import java.io.*;

public class ImageConversion {
    public static void main(String[] args) {
        String inputImagePath = "C:\\Users\\Asus\\Desktop\\original.jpeg";
        String outputImagePath = "C:\\Users\\Asus\\Desktop\\copy.jpeg";

        try {
            FileInputStream fis = new FileInputStream(inputImagePath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();
            fis.close();
            baos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImagePath);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            if (areFilesIdentical(inputImagePath, outputImagePath)) {
                System.out.println("Success");
            } else {
                System.out.println("Failure");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static boolean areFilesIdentical(String file1, String file2) throws IOException {
        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        int b1, b2;
        do {
            b1 = fis1.read();
            b2 = fis2.read();
            if (b1 != b2) {
                fis1.close();
                fis2.close();
                return false;
            }
        } while (b1 != -1 && b2 != -1);

        fis1.close();
        fis2.close();
        return true;
    }
}
