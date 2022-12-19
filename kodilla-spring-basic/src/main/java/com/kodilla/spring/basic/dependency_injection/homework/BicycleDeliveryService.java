package com.kodilla.spring.basic.dependency_injection.homework;

public class BicycleDeliveryService implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 10) {
            System.out.println("Package too heavy for bicycle");
            return false;
        }
        System.out.println("Delivery by bicycle in progress...");
        return true;
    }
}
