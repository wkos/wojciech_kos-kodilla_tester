package com.kodilla.parmetrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {
    StringManipulator stringManipulator = new StringManipulator();
    @ParameterizedTest
    @CsvSource(value = {"test, tset", "OTher, rehto", "EvEnt, tneve", "null, llun", "A, a"})
    public void shouldReturnReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected, stringManipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReturnReverseStringWithLowerCaseFromFile(String input, String expected){
        assertEquals(expected, stringManipulator.reverseWithLowerCase(input));
    }

//    @ParameterizedTest
//    @CsvSource(value = {"test, 4", "a a a, 3", "null, 4", "A, 1"})
//    public void shouldReturnLengthOfStringWithoutSpaces(String text, int length){
//        int textLength = stringManipulator.getStringLengthWithoutSpaces(text);
//        assertEquals(length, textLength);
//    }

    @ParameterizedTest
    @MethodSource(value = "provideStringsForTestingLength")
    public void shouldReturnLengthOfStringWithoutSpaces(String text, int length){
        int textLength = stringManipulator.getStringLengthWithoutSpaces(text);
        assertEquals(length, textLength);
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "a,a,a,a:3", "ala ma kota:0", "null:0", "A:0"}, delimiter = ':')
    public void shouldReturnNumberOfCommasInString(String input, int expected){
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithCommas.csv", delimiter = ':')
    public void shouldReturnNumberOfCommasInStringFromFile(String input, int expected){
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parmetrized_tests.StringSources#provideStringsForTestingLengthV")
    public void shouldReturnLengthOfStringWithoutSpacesV(String input, int expected){
        int textLength = stringManipulator.getStringLengthWithoutSpaces(input);
        assertEquals(expected, textLength);
    }

    private static Stream<Arguments> provideStringsForTestingLength(){
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OTher", 5),
                Arguments.of("E v e n t", 5),
                Arguments.of("null", 4),
                Arguments.of("A", 1)
        );
    }
}