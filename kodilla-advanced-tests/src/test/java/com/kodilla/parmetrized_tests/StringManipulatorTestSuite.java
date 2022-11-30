package com.kodilla.parmetrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {
    StringManipulator stringManipulator = new StringManipulator();
    @ParameterizedTest
    @CsvSource(value = {"test, tset", "OTher, rehto", "EvEnt, tneve", "null, llun", "A, a"})
    public void shouldReturnReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected, stringManipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test, 4", "a a a, 3", "null, 4", "A, 1"})
    public void shouldReturnLengthOfStringWithoutSpaces(String text, int length){
        int textLength = stringManipulator.getStringLengthWithoutSpaces(text);
        assertEquals(length, textLength);
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "a,a,a,a:3", "ala ma kota:0", "null:0", "A:0"}, delimiter = ':')
    public void shouldReturnNumberOfCommasInString(String input, int expected){
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }
}