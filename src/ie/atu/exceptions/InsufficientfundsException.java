package ie.atu.exceptions;
import java.util.Scanner;

public class InsufficientfundsException extends Exception {
    public InsufficientfundsException(String message) {
        super(message);
    }
}

class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount want to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.close();
        try{
            withdraw(amount);
        } catch (InsufficientfundsException e) {
            System.out.println(e.getMessage());
        }
    }
    

    public static void withdraw(double amount) throws InsufficientfundsException {
        double balance = 50.99;
        if (amount > balance) {
            throw new InsufficientfundsException("Insufficient funds for withdrawal. Available balance: " + balance);
        }
        System.out.println(("Withdraw succesfully!"));
    }
}
