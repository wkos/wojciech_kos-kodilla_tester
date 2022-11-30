package com.kodilla.parmetrized_tests;

public class StringVlidator {
    public  boolean isBlank(String text){
        return text == null || text.trim().isEmpty();
    }
}
