package com.kodilla.parmetrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonDataSources {
    private static Stream<Arguments> providePersonalDataForTestingBmi(){
        return Stream.of(
                Arguments.of(1.8, 45.36, "Very severely underweight"),
                Arguments.of(1.8, 48.6, "Severely underweight"),
                Arguments.of(1.8, 51.516, "Severely underweight"),
                Arguments.of(1.8, 51.84, "Underweight"),
                Arguments.of(1.8, 59.616, "Underweight"),
                Arguments.of(1.8, 59.94, "Normal (healthy weight)"),
                Arguments.of(1.8, 80.676, "Normal (healthy weight)"),
                Arguments.of(1.8, 81, "Overweight"),
                Arguments.of(1.8, 96.876, "Overweight"),
                Arguments.of(1.8, 97.2, "Obese Class I (Moderately obese)"),
                Arguments.of(1.8, 113.076, "Obese Class I (Moderately obese)"),
                Arguments.of(1.8, 113.4, "Obese Class II (Severely obese)"),
                Arguments.of(1.8, 129.276, "Obese Class II (Severely obese)"),
                Arguments.of(1.8, 129.6, "Obese Class III (Very severely obese)"),
                Arguments.of(1.8, 145.476, "Obese Class III (Very severely obese)"),
                Arguments.of(1.8, 145.8, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.8, 161.676, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.8, 162, "Obese Class V (Super Obese)"),
                Arguments.of(1.8, 194.076, "Obese Class V (Super Obese)"),
                Arguments.of(1.8, 194.4, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.8, 259.2, "Obese Class VI (Hyper Obese)")
        );
    }
}
