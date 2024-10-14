package ie.atu.exceptions;
// import java.util.Scanner;

public class InsufficientfundsException extends Exception {
    public InsufficientfundsException(String message) {
        super(message);
    }
}

// class BankAccount {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Amount want to withdraw: ");
//         double amount = scanner.nextDouble();
//         scanner.close();
//         try{
//             withdraw(amount);
//         } catch (InsufficientfundsException e) {
//             System.out.println(e.getMessage());
//         }
//     }
    

//     public static void withdraw(double amount) throws InsufficientfundsException {
//         double balance = 50.99;
//         if (amount > balance) {
//             throw new InsufficientfundsException("Insufficient funds for withdrawal. Available balance: " + balance);
//         }
//         System.out.println(("Withdraw succesfully!"));
//     }
// }
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientfundsException {
        if (amount > balance) {
            throw new InsufficientfundsException("Insufficient funds for withdrawal. Available balance: " + balance);
        }
        balance -= amount;

        System.out.println("Withdrawal successfull. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        try {account.withdraw(150);}
        catch (InsufficientfundsException e) {System.out.println(e.getMessage());}
    }
        
    }
