package com.kodilla.inheritance.homework;

public class TabletSystem extends OperatingSystem{
    public TabletSystem(int year){
        super(year);
        System.out.println("In tablet system");
    }
    @Override
    public void turnOn(){
        System.out.println("Tablet system turned on");
    }

    @Override
    public void turnOff(){
        System.out.println("Tablet system turned off");
    }
}
