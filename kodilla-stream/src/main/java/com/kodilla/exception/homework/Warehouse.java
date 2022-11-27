package com.kodilla.exception.homework;

import com.kodilla.exception.SecondExample;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        if (orders.stream().anyMatch(u -> u.getNumber().equals(number))) {
            Order orderFromNumber = orders
                    .stream()
                    .filter(u -> u.getNumber().equals(number))
                    .toList()
                    .get(0);
            return orderFromNumber;
        }
        throw new OrderDoesntExistException();
    }

    @Override
    public String toString() {
        String orders = "Warehouse{orders:";
        for(Order order : this.orders){
            orders += order.getNumber() + ", ";
        }
        return orders;
    }
}
