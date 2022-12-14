package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    public void increaseSpeedBy(int amountOfIncrease){
        speed += amountOfIncrease;
    }

    @Override
    public void decreaseSpeed() {
        speed -= FORD_SPEED_DECREASE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ford)) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
