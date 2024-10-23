package ie.atu.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FileReverser03 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("/workspaces/week5-exceptions-lab-chauminh24/src/ie/atu/inputoutput/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        
        Collections.reverse(lines);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/workspaces/week5-exceptions-lab-chauminh24/src/ie/atu/inputoutput/reverse.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
