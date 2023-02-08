package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    @Test
    void shouldBeLeapYearIfDivisibleBy400() {
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }
    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy400AndDivisibleBy100And4() {
        //given
        Year year = new Year(1400);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfNotDivisibleBy100AndDivisibleBy4() {
        //given
        Year year = new Year(1940);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy4() {
        //given
        Year year = new Year(2013);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }
}