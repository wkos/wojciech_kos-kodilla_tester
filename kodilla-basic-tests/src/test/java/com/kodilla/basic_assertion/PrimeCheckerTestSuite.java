package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {
    PrimeChecker checker = new PrimeChecker();
    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber(){
        boolean result = checker.isPrime(14);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingPrimeNumber(){
        boolean result = checker.isPrime(13);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingTwo(){
        boolean result = checker.isPrime(2);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne(){
        boolean result = checker.isPrime(1);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero(){
        boolean result = checker.isPrime(0);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber(){
        boolean result = checker.isPrime(-6);
        assertFalse(result);
    }
}
