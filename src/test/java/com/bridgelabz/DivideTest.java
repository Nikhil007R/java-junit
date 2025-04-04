package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;


class DivideTest {

    @Test
    public void testDivide() {
        assertEquals(3, Divide.divide(9, 3));
        assertEquals(-2, Divide.divide(-6, 3));
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0),
                "Expected ArithmeticException when dividing by zero");
    }
}