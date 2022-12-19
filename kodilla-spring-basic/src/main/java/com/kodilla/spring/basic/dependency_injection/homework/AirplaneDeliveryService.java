package com.kodilla.spring.basic.dependency_injection.homework;

public class AirplaneDeliveryService implements DeliveryService{
    public boolean deliverPackage(String address, double weight){
        if (weight > 3000) {
            System.out.println("Package too heavy for airplane");
            return false;
        }
        System.out.println("Delivery by airplane in progress...");
        return true;
    }
}
