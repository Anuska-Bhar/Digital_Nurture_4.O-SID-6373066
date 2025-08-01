package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setting up Calculator instance...");
        calc = new Calculator(); // Arrange
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up Calculator instance...");
        calc = null;
    }

    @Test
    public void testAddition() {
        // Arrange: Already done in @Before

        // Act
        int result = calc.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testDivision() {
        // Act
        int result = calc.divide(20, 4);

        // Assert
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        // Act
        calc.divide(10, 0);
    }
}
