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

        int subtractResult = calculator.subtract(a, b);
        correct = ResultChecker.assertEquals(2, subtractResult);
        if(correct){
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        correct = ResultChecker.assertEquals(49, squareResult);
        if(correct){
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }

}
