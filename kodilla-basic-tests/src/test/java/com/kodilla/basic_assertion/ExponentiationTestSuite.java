package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExponentiationTestSuite {
    @Test
    public void testExponentiation() {
        assertEquals(1.0, exponentiate(0.0, 0), 0.0001);
        assertEquals(1.0, exponentiate(1.0, 0), 0.0001);
        assertEquals(1.0, exponentiate(-1.0, 0), 0.0001);
        assertEquals(1.0, exponentiate(2.0, 0), 0.0001);
        assertEquals(-1.0, exponentiate(-1.0, 1), 0.0001);
        assertEquals(8.0, exponentiate(2.0, 3), 0.0001);
        assertEquals(0.5, exponentiate(2.0, -1), 0.0001);
        assertEquals(0.25, exponentiate(2.0, -2), 0.0001);
        assertEquals(0.0, exponentiate(0.0, 10), 0.0001);
    }

    public double exponentiate(double liczba, int wykladnik) {
        if (wykladnik == 0) {
            return 1.0;
        }
        if (liczba == 0.0) {
            return 0.0;
        }
        if (wykladnik < 0) {
            return 1.0 / exponentiate(liczba, -wykladnik);
        }
        double wynik = 1.0;
        for (int i = 1; i <= wykladnik; i++) {
            wynik *= liczba;
        }
        return wynik;
    }
}
