package ie.atu.exceptions;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        scanner.close();
        try {
            calculateGrade(score);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void calculateGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid score");
        }
        System.out.println("Score is valid");
        
    }
}
