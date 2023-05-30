package com.kodilla.homeworkTEST;

import com.kodilla.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTest {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"john.doe", "jane_doe", "123456"})
    void shouldValidateCorrectUsernames(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jo", "j", "$$john", "john doe"})
    void shouldNotValidateIncorrectUsernames(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "user-1@example.co.uk", "john_doe123@example.com"})
    void shouldValidateCorrectEmails(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", "user@example", "john.doe@example", "john_doe@example."})
    void shouldNotValidateIncorrectEmails(String email) {
        assertFalse(validator.validateEmail(email));
    }
}