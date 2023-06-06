package com.kodilla.spring.basic.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        calculator.add(2.5, 3.5);
    }

    @Test
    public void testSubtract() {
        calculator.subtract(5.0, 2.0);
    }

    @Test
    public void testMultiply() {
        calculator.multiply(4.0, 2.5);
    }

    @Test
    public void testDivide() {
        calculator.divide(10.0, 2.0);
    }

    @Test
    public void testDivideByZero() {
        calculator.divide(5.0, 0.0);
    }
}