package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String purchaser;

    public Order(double orderValue, LocalDate orderDate, String purchaser) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.purchaser = purchaser;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getPurchaser() {
        return purchaser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.orderValue, orderValue) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(purchaser, order.purchaser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, orderDate, purchaser);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", purchaser='" + purchaser + '\'' +
                '}';
    }
}
