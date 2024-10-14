package ie.atu.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources{
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            // String line = br.readLine();
            // System.out.println(line);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException occurred!");
        }
    }
}