package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Saab implements Car{
    private static final int SAAB_SPEED_INCREASE = 30;
    private static final int SAAB_SPEED_DECREASE = 45;
    private int speed;

    public Saab(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += SAAB_SPEED_INCREASE;
    }

    public void increaseSpeedBy(int amountOfIncrease){
        speed += amountOfIncrease;
    }

    @Override
    public void decreaseSpeed() {
        speed -= SAAB_SPEED_DECREASE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Saab)) return false;
        Saab saab = (Saab) o;
        return speed == saab.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
