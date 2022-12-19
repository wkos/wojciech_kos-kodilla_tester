package com.kodilla.spring.basic.dependency_injection.homework;

public class BicycleNotificationService implements NotificationService{
    public void success(String address){
        System.out.println("Package delivered to: " + address + " by bicycle");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + " by bicycle");
    }
}
