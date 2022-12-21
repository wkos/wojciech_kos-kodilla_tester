package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public void display(double value){
        System.out.format("Wynik działania to: %.2f\n", value);
    }
}
