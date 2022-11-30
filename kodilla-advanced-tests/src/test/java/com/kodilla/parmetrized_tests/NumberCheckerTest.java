package com.kodilla.parmetrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTestSuite {
    NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})
    public void shouldReturnTrueForNumberDivisibleByThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 14})
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }
}