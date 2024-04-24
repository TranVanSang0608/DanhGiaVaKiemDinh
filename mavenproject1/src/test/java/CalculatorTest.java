/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 06082
 */

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int num1 = 10;
        int num2 = 5;
        int expected = 15;
        int actual = calculator.add(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int num1 = 10;
        int num2 = 5;
        int expected = 5;
        int actual = calculator.subtract(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int num1 = 10;
        int num2 = 5;
        int expected = 50;
        int actual = calculator.multiply(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int num1 = 10;
        int num2 = 5;
        double expected = 2.0;
        double actual = calculator.divide(num1, num2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        int num1 = 10;
        int num2 = 0;
        double expected = Double.POSITIVE_INFINITY; // or any other appropriate value
        double actual = calculator.divide(num1, num2);
        // assertEquals(expected, actual); // This will fail the test
        // Instead, you can use a custom assertion message
        assertEquals(expected, actual, "Division by zero should return positive infinity");
    }
}
