import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamReplaceSpace {

    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "input1.txt";
        String outputFile = "output1.txt";

        try (
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile)
        ) {
            int charData;

            while ((charData = reader.read()) != -1) {
                char ch = (char) charData;

                // Replace space with hyphen
                if (ch == ' ') {
                    ch = '-';
                }

                writer.write(ch);
            }

            System.out.println("File has been processed and saved as: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}

