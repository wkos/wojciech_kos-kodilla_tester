package com.kodilla.parmetrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/*
      Zamieniłem double na BigDecimal, bo były błędy i wartości bmi były źle obliczane
 */

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parmetrized_tests.homework.PersonDataSources#providePersonalDataForTestingBmi")
    public void shouldReturnCorrectMessageForWeightAndHeight(double height, double weight, String expected){
        Person person = new Person(BigDecimal.valueOf(height), BigDecimal.valueOf(weight));
        assertEquals(expected, person.getBMI());
    }
}