package ie.atu.exceptions;
import java.util.Scanner;

public class TemparatureArray {
    public static void main(String[] args) {
        int[] temperature = {20, 22, 24, 21, 23, 18, 25};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        scanner.close();

        try {    
            System.out.println("Temparture is: " + temperature[day]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input number not valid! Please enter number from 1 to 7");
        }
    }
}
