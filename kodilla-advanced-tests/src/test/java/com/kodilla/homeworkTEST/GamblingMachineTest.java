package com.kodilla.homeworkTEST;

import com.kodilla.homework.InvalidNumbersException;
import com.kodilla.homework.parametrized_tests.GamblingMachine;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTest {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gambling_machine_test_data.csv", numLinesToSkip = 1)
    void shouldCountCorrectWins(String numbersString, int expectedWins) throws InvalidNumbersException {
        String[] numbersArray = numbersString.split(" ");
        Set<Integer> userNumbers = new HashSet<>();
        for (String number : numbersArray) {
            userNumbers.add(Integer.parseInt(number));
        }

        int actualWins = gamblingMachine.howManyWins(userNumbers);

        assertEquals(expectedWins, actualWins);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gambling_machine_invalid_data.csv", numLinesToSkip = 1)
    void shouldThrowExceptionForInvalidNumbers(String numbersString) {
        String[] numbersArray = numbersString.split(" ");
        Set<Integer> userNumbers = new HashSet<>();
        for (String number : numbersArray) {
            userNumbers.add(Integer.parseInt(number));
        }

        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
    }
}
