package com.kodilla.parmetrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ala", "abc1-", "-ABc_", "_-abc", ".as", ".-_", "....", "---"})
    public void shoudReturnTrueWhenUsernameIsCorrect(String username){
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"as", "..", "abc-.$", "", "!@#", ".."})
    public void shouldReturnTrueWhenUsernameIsNotCorrect(String username){
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"tomek@drogimex.pl", "tomek.sochacki@drogimex.pl",
            "ToMeK@drogimex.pl", "tomek123@domena111.pl", "tomek_123@domena.pl", "11tomek@domena.pl",
            "-tomek@domena.net", "_tomek@domena.pl", "tomek@-domena.pl", "test@test.b"})
    public void shoudReturnTrueWhenEmailIsCorrect(String email){
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"tomek.drogimex.pl",
            "@domena.pl", "tomek@domena", "tomek@domena.", "marek@ala.asdasdf", "!.a.b@test.com",
            "tomek@_domena.pl", "łukasz@kórnik.gov", "a..@test.com", "ala@com.", "ela@.com",
            "tomek@urzad.gov.pl"})
    public void shoudReturnFalseWhenEmailIsNotCorrect(String email){
        assertFalse(userValidator.validateEmail(email));
    }
}