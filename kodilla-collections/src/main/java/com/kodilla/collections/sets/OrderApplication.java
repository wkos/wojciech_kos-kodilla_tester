package com.kodilla.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders  = new HashSet<>();
        orders.add(new Order("1/2022", "Iron", 10.0));
        orders.add(new Order("2/2022", "Cutlery", 7.0));
        orders.add(new Order("3/2022", "Chair", 3.0));
        orders.add(new Order("1/2022", "Iron", 10.0));

        System.out.println(orders.size());
        for(Order order : orders){
            System.out.println(order);
        }
    }
}
