package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Shop {
    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public Set<Order> getOrdersOnDatesFromTo(LocalDate dateFrom, LocalDate dateTo){
        Set<Order> ordersFromTo = new HashSet<>();
        for(Order order : orders){
            if((order.getOrderDate().isAfter(dateFrom) || order.getOrderDate().isEqual(dateFrom))
            && (order.getOrderDate().isBefore(dateTo) || order.getOrderDate().isEqual(dateTo))){
                ordersFromTo.add(order);
            }
        }
        return ordersFromTo;
    }

    public Set<Order> getOrdersOnOrderValuesFromTo(double minValue, double maxValue){
        Set<Order> ordersFromTo = new HashSet<>();
        for(Order order : orders){
            if(order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue){
                ordersFromTo.add(order);
            }
        }
        return ordersFromTo;
    }

    public int getSize(){
        return orders.size();
    }

    public double getValueOfAllOrders(){
        double sum = 0;
        for(Order order : orders){
            sum += order.getOrderValue();
        }
        return sum;
    }
}
