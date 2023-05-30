package com.kodilla.homeworkTEST;

import com.kodilla.homework.parametrized_tests.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    void shouldCalculateCorrectBMI(Person person, String expectedBMI) {
        // Given

        // When
        String calculatedBMI = person.getBMI();

        // Then
        assertEquals(expectedBMI, calculatedBMI);
    }

    private static Stream<Object[]> provideTestData() {
        return Stream.of(
                new Object[]{new Person(1.70, 50), "Very severely underweight"},
                new Object[]{new Person(1.65, 55), "Severely underweight"},
                new Object[]{new Person(1.80, 65), "Underweight"},
                new Object[]{new Person(1.75, 70), "Normal (healthy weight)"},
                new Object[]{new Person(1.65, 80), "Overweight"},
                new Object[]{new Person(1.80, 95), "Obese Class I (Moderately obese)"},
                new Object[]{new Person(1.70, 110), "Obese Class II (Severely obese)"},
                new Object[]{new Person(1.75, 130), "Obese Class III (Very severely obese)"},
                new Object[]{new Person(1.80, 150), "Obese Class IV (Morbidly Obese)"},
                new Object[]{new Person(1.90, 180), "Obese Class V (Super Obese)"},
                new Object[]{new Person(1.70, 200), "Obese Class VI (Hyper Obese)"}
        );
    }
}