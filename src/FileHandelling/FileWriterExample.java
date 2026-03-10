package FileHandelling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    static void main(String[] args) {
        String fileName = "example.txt";

        try ( FileWriter writer = new FileWriter(fileName) ) {
            writer.write("Hello this is a test...\n");
            for (int i = 0; i < 100; i++) {
                writer.write("Line " + (i + 1) + "\n");
            }
            writer.flush();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred..."+e.getMessage());
        }
    }
}
