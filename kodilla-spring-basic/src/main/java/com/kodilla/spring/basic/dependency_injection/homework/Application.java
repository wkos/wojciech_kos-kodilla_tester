package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        AirplaneDeliveryService airplaneDeliveryService = new AirplaneDeliveryService();
        BoatDeliveryService boatDeliveryService = new BoatDeliveryService();
        BicycleDeliveryService bicycleDeliveryService = new BicycleDeliveryService();
        AirplaneNotificationService airplaneNotificationService = new AirplaneNotificationService();
        BoatNotificationService boatNotificationService = new BoatNotificationService();
        BicycleNotificationService bicycleNotificationService = new BicycleNotificationService();

        ShippingCenter airplaneShippingCenter = new ShippingCenter(airplaneDeliveryService, airplaneNotificationService);
        ShippingCenter boatShippingCenter = new ShippingCenter(boatDeliveryService, boatNotificationService);
        ShippingCenter bicycleShippingCenter = new ShippingCenter(bicycleDeliveryService, bicycleNotificationService);
        airplaneShippingCenter.sendPackage("Hill Street 11, New York", 5800.2);
        airplaneShippingCenter.sendPackage("Zielona 54, Kalisz", 58);
        boatShippingCenter.sendPackage("Zielona 22, Kalisz", 450);
        boatShippingCenter.sendPackage("Różowa 77, Poznań", 34);
        bicycleShippingCenter.sendPackage("Brązowa 88, Poznań", 45);
        bicycleShippingCenter.sendPackage("Fioletowa 11, Warszawa", 9);
    }
}
