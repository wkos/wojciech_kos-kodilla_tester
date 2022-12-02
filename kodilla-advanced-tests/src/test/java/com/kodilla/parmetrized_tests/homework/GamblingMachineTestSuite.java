package com.kodilla.parmetrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    private static final String EXPECTED_MESSAGE_EXCEPTION = "Wrong numbers provided";
    GamblingMachine gamblingMachine = new GamblingMachine();
    Set<Integer> userNumbers = new HashSet<>();

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectDataSize.csv", delimiter = '\n')
    public void shouldThrowExceptionWhenSizeIsNotCorrect(String numbers){
        Set<Integer> setOfNumbers = Arrays.stream(numbers.split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(setOfNumbers));
        assertEquals(EXPECTED_MESSAGE_EXCEPTION, exception.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/incorrectNumbersWithSizeSix.csv", delimiter = '\n')
    public void shouldThrowExceptionWhenSizeIsCorrectButNumbersAreOutOfScope(String numbers){
        Set<Integer> setOfNumbers = Arrays.stream(numbers.split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
        InvalidNumbersException exception = assertThrows(InvalidNumbersException.class,
                () -> gamblingMachine.howManyWins(setOfNumbers));
        assertEquals(EXPECTED_MESSAGE_EXCEPTION,exception.getMessage());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", delimiter = '\n')
    public void shoudReturnValueBetweenZeroAndSixWithBoundaries(String numbers) throws InvalidNumbersException {
        Set<Integer> setOfNumbers = Arrays.stream(numbers.split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toSet());
        System.out.println(setOfNumbers);
        int result = gamblingMachine.howManyWins(setOfNumbers);
        System.out.println(result);
        assertTrue(result >= 0 && result <= 6);
    }
}