package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2022/11/26/01"));
        warehouse.addOrder(new Order("2022/11/26/02"));
        warehouse.addOrder(new Order("2022/11/27/01"));
        warehouse.addOrder(new Order("2022/11/27/02"));
        System.out.println(warehouse);

        String orderNumber = "2022/11/25/01";
        try {
            Order order = warehouse.getOrder(orderNumber);
            System.out.println("Order number: " + orderNumber + " is present");
        } catch (OrderDoesntExistException e) {
            System.out.println("No order number: " + orderNumber);
        }
    }
}
