package week10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        String s = "";

        try (FileReader fileReader = new FileReader("src/week10/text.txt");
             FileWriter fileWriter = new FileWriter("src/week10/copiedText.txt")) {
            int inChar = fileReader.read();
            while (inChar != -1) {
                s += (char) inChar;
                inChar = fileReader.read();
            }
            fileWriter.write(s);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
