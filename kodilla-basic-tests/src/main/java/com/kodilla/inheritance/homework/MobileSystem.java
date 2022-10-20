package com.kodilla.inheritance.homework;

public class MobileSystem extends OperatingSystem{
    public MobileSystem(int year){
        super(year);
        System.out.println("In mobile system");
    }
    @Override
    public void turnOn(){
        System.out.println("Mobile system turned on");
    }

    @Override
    public void turnOff(){
        System.out.println("Mobile system turned off");
    }
}
