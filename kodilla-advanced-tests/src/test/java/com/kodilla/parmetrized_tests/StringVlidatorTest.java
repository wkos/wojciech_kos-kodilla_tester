package com.kodilla.parmetrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringVlidatorTest {
    private StringVlidator stringVlidator = new StringVlidator();

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueforNullOrEmptyString(String text){
        assertTrue(stringVlidator.isBlank(text));
    }

}