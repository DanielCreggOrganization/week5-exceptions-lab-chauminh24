package ie.atu.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReverser {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("/workspaces/week5-exceptions-lab-chauminh24/src/ie/atu/inputoutput/input.txt");
            writer = new FileWriter("/workspaces/week5-exceptions-lab-chauminh24/src/ie/atu/inputoutput/output.txt");
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(Character.toUpperCase(character));
            }
        } catch (IOException e) {
            System.out.println("Error with file operations: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
