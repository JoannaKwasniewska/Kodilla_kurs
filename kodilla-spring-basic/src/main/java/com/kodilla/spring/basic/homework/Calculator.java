package com.kodilla.spring.basic.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public void add(double a, double b) {
        double result = a + b;
        display.display(result);
    }

    public void subtract(double a, double b) {
        double result = a - b;
        display.display(result);
    }

    public void multiply(double a, double b) {
        double result = a * b;
        display.display(result);
    }

    public void divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            display.display(result);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}
