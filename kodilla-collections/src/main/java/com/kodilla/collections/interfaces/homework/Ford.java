package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private static final int FORD_SPEED_INCREASE = 10;
    private static final int FORD_SPEED_DECREASE = 20;
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += FORD_SPEED_INCREASE;
    }

    @Override
    public void decreaseSpeed() {
        speed -= FORD_SPEED_DECREASE;
    }
}
