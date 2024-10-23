package ie.atu.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReverser02 {
    public static void main(String[] args) {
        int charCount = 0;
        try (FileReader reader = new FileReader("/workspaces/week5-exceptions-lab-chauminh24/src/ie/atu/inputoutput/input.txt");
             FileWriter writer = new FileWriter("/workspaces/week5-exceptions-lab-chauminh24/src/ie/atu/inputoutput/output.txt")) {
            
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }
            
        } catch (IOException e) {
            System.out.println("Error with file operations: " + e.getMessage());
        }

        try (FileWriter summaryWriter = new FileWriter("summary.txt")) {
            summaryWriter.write("Character Count: " + charCount);
        } catch (IOException e) {
            System.out.println("Error writing summary: " + e.getMessage());
        }
    }
}
