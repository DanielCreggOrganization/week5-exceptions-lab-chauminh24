package ie.atu.exceptions;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        try {
            int div = num1/num2;
            System.out.println("Reseult: " + div);
        } catch (ArithmeticException e) {
            System.out.println("error... You cannot divide numbers by 0");
        } finally {
            
            System.out.println("Calculation completed!");
        }
    }

}
