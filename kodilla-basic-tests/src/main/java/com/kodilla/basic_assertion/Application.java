package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 7;
        int b = 5;
        int sumResult = calculator.add(a, b);
        boolean correct = ResultChecker.assertEquals(12, sumResult);
        if (correct) {
            System.out.println("Metoda add działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda add nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
