package com.kodilla.inheritance.homework;

public class TestSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        MobileSystem mobileSystem = new MobileSystem(2022);
        mobileSystem.turnOn();
        mobileSystem.turnOff();
        TabletSystem tabletSystem = new TabletSystem(2012);
        tabletSystem.turnOn();
        tabletSystem.turnOff();
    }
}
