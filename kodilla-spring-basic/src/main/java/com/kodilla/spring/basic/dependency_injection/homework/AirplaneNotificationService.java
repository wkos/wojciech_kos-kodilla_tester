package com.kodilla.spring.basic.dependency_injection.homework;

public class AirplaneNotificationService implements NotificationService{
    public void success(String address){
        System.out.println("Package delivered to: " + address + " by airplane");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + " by airplane");
    }
}
