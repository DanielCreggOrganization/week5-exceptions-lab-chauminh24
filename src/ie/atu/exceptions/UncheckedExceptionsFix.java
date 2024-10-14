package ie.atu.exceptions;

public class UncheckedExceptionsFix {
    public static void main(String[] args) {
        // String text = null;
        String text = "Hello World";
        System.out.println(text.length());

        int[] numbers = {1, 2, 3};
        // System.out.println(numbers[5]);
        System.out.println(numbers[2]);
    }
}
