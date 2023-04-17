package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(8,5);
        int a = 8;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        int subResult = calculator.sub(a, b);
        int squareResult = calculator.square(a);

        boolean sumCorrect = ResultChecker.assertEquals(13, sumResult);
        if (sumCorrect) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean subCorrect = ResultChecker.assertEquals(3, subResult);
        if (subCorrect) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean squareCorrect = ResultChecker.assertEquals(64, squareResult);
        if (squareCorrect) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }

    }
}

