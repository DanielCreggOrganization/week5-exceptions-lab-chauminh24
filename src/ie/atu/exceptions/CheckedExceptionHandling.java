package ie.atu.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        
        try {
            FileReader reader = new FileReader("example.txt");
            System.out.println("File opened succesfully!");
        }
        catch (IOException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        // System.out.println("File opened succesfully!");

    }
}
