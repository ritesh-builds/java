package FileHandelling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (FileReader reader = new FileReader(fileName)){
           int read = 0;
           do{
               read = reader.read();
               System.out.print((char)read);
           }while(read != -1);

        }catch(IOException e){
            System.out.println("An error occurred...");
            System.out.println(e.getMessage());
        }
    }
}
