package com.bridgelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setup(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test Addition Method")
    public void addTest(){
        Assertions.assertEquals(30, calculator.add(10,20));
    }

    @Test
    @DisplayName("Test Subtraction Method")
    public void subtractTest(){
        Assertions.assertEquals(20, calculator.subtract(40,20));
    }

    @Test
    @DisplayName("Test Multiplication Method")
    public void multiplyTest(){
        Assertions.assertEquals(32, calculator.multiply(4,8));
    }

    @Test
    @DisplayName("Test Divide Method")
    public void divideTest(){
        Assertions.assertEquals(4, calculator.divide(24,6));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
    }
}

