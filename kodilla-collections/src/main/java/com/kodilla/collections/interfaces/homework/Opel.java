package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private static final int OPEL_SPEED_INCREASE = 20;
    private static final int OPEL_SPEED_DECREASE = 30;
    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += OPEL_SPEED_INCREASE;
    }

    public void increaseSpeedBy(int amountOfIncrease){
        speed += amountOfIncrease;
    }

    @Override
    public void decreaseSpeed() {
        speed -= OPEL_SPEED_DECREASE;
    }
}
