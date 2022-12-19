package com.kodilla.spring.basic.dependency_injection.homework;

public class BoatDeliveryService implements DeliveryService{

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy for boat");
            return false;
        }
        System.out.println("Delivery by boat in progress...");
        return true;
    }
}
