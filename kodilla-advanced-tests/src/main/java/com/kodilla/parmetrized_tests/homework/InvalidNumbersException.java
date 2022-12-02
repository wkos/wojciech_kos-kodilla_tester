package com.kodilla.parmetrized_tests.homework;

public class InvalidNumbersException extends Exception{
    public InvalidNumbersException() {
        super("Wrong numbers provided");
    }
}
