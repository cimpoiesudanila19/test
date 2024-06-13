package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdditionPositiveNumber() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testAdditionNegativeNumber() {
        assertEquals(-7, calculator.add(-3, -4));
        assertEquals(-12, calculator.add(-5, -7));
    }

    @Test
    void testAdditionPositiveAndNegativeNumber() {
        assertEquals(8, calculator.add(10, -2));
        assertEquals(-5, calculator.add(-10, 5));
    }

    @Test
    void testAdditionWithZero() {
        assertEquals(5, calculator.add(5, 0));
        assertEquals(-3, calculator.add(0, -3));
        assertEquals(0, calculator.add(0, 0));
    }
}
