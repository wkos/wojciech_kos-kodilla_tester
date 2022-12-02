package com.kodilla.parmetrized_tests;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class StringSources {
    private static Stream<Arguments> provideStringsForTestingLengthV(){
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OTher", 5),
                Arguments.of("E v e n t", 5),
                Arguments.of("null", 4),
                Arguments.of("A", 1)
        );
    }
}
