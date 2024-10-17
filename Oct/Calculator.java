package Oct;

public class Calculator {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println("Addition: " + addition.add(10, 5));
        System.out.println("Subtraction: " + subtraction.subtract(10, 5));
        System.out.println("Multiplication: " + multiplication.multiply(10, 5));
        System.out.println("Division: " + division.divide(10, 5));
    }
}
