public class Calculator {
    // Method to perform addition
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to perform division
    public double divide(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 5;

        System.out.println("Sum = " + calculator.add(num1, num2));
        System.out.println("Difference = " + calculator.subtract(num1, num2));
        System.out.println("Product = " + calculator.multiply(num1, num2));
        System.out.println("Quotient = " + calculator.divide(num1, num2));
    }
}