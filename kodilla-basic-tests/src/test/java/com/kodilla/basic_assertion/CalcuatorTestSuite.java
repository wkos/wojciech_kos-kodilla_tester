package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcuatorTestSuite {
    //czy mam przepisać te metody na double? nie widzę dla tego zadania potrzeby porównywania liczb rzeczywistych,
    //chyba że coś mi umknęło
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int resultSum = calculator.add(a, b);
        assertEquals(13, resultSum);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int resultSubtract = calculator.subtract(a, b);
        assertEquals(-2, resultSubtract);
    }

    @Test
    public void testSquareOfTen(){
        Calculator calculator = new Calculator();
        int a = 10;
        int resultSquare = calculator.square(a);
        assertEquals(100, resultSquare);
    }

    @Test
    public void testSquareOfMinusTen(){
        Calculator calculator = new Calculator();
        int a = -10;
        int resultSquare = calculator.square(a);
        assertEquals(100, resultSquare);
    }

    @Test
    public void testSquareOfZero(){
        Calculator calculator = new Calculator();
        int a = 0;
        int resultSquare = calculator.square(a);
        assertEquals(0, resultSquare);
    }
}
