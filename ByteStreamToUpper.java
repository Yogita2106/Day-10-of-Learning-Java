import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamToUpper {

    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile)
        ) {
            int byteData;

            while ((byteData = fis.read()) != -1) {
                char ch = (char) byteData;

                // Convert lowercase letters to uppercase
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 'a' + 'A');
                }

                fos.write((byte) ch);
            }

            System.out.println("File has been processed and saved as: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
