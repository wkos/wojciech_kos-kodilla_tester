package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void testGetOrderWithNumberOrderNotInOrderNumbers(){
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2022/11/26/01"));
        warehouse.addOrder(new Order("2022/11/26/02"));
        warehouse.addOrder(new Order("2022/11/27/01"));
        warehouse.addOrder(new Order("2022/11/27/02"));
        String orderNumberNotInOrderNumbers = "2022/11/25/01";
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder(orderNumberNotInOrderNumbers));
    }

}