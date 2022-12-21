package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    void shouldReturnCorrectValueAfterAddingTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.add(2,5);
        Assertions.assertEquals(7, result);
    }

    @Test
    void shouldReturnCorrectValueAfterSubtractingTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.subtract(2, 5);
        Assertions.assertEquals(-3, result);
    }

    @Test
    void shouldReturnCorrectValueAfterMultiplyingTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.multiply(2, 7);
        Assertions.assertEquals(14, result);
    }

    @Test
    void shouldReturnCorrectValueAfterDividingTwoNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.divide(2, 7);
        Assertions.assertEquals(0.29, result, 0.01);
    }

    @Test
    void shouldReturnPositiveInfinityAfterDividingPositiveNumberByZero(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.divide(2, 0);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void shouldReturnNegativeInfinityAfterDividingNegativeNumberByZero(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.divide(-2, 0);
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    void shouldReturnNaNWhenDividingZeroByZero(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.divide(0, 0);
        Assertions.assertEquals(Double.NaN, result);
    }
}