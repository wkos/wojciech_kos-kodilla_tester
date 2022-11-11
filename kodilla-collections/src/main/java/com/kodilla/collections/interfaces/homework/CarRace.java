package com.kodilla.collections.interfaces.homework;

public class CarRace {
    private static final int DECREASE_NUMBER = 2;
    private static final int INCREASE_NUMBER = 3;

    public static void main(String[] args) {
        Car ford = new Ford(150);
        Car opel = new Opel(145);
        Car saab = new Saab(225);
        doRace(ford);
        doRace(opel);
        doRace(saab);
    }

    private static void doRace(Car car) {
        for(int i = 0; i < INCREASE_NUMBER; i++) {
            car.increaseSpeed();
        }
        for(int i = 0; i < DECREASE_NUMBER; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
