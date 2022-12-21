package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        display.display(a + b);
        return a + b;
    }

    public double subtract(double a, double b){
        display.display(a - b);
        return a - b;
    }

    public double multiply(double a, double b){
        display.display(a * b);
        return a * b;
    }

    public double divide(double a, double b){
        if(b != 0){
            display.display(a / b);
            return a / b;
        } else if(a > 0){
            display.display(Double.POSITIVE_INFINITY);
            return Double.POSITIVE_INFINITY;
        } else if(a < 0){
            display.display(Double.NEGATIVE_INFINITY);
            return Double.NEGATIVE_INFINITY;
        } else {
            display.display(Double.NaN);
            return Double.NaN;
        }
    }
}
