package ie.atu.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuExample {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("enter 1st number: ");
                    num1 = scanner.nextInt();

                    System.out.print("enter 2nd number: ");
                    num2 = scanner.nextInt();

                    int result = num1 / num2;

                    System.out.println("result: " + result);
                    validInput = true;
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Error: " + e.getMessage());
                    scanner.nextLine(); // Clear the buffer
                }
            }
        }
    }
}
