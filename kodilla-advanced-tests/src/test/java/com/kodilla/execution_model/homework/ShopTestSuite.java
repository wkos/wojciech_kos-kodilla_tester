package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/*

  Nie przyczytałem, że trzeba najpierw wysłać testy i zrobiłem wszystko. Widzę, że muszę czytać treść
  do końca, a nie wykonwyać po kolei polecenia.
 */

class ShopTestSuite {
        Shop shop = new Shop();
        Order carrot = new Order(12.4, LocalDate.parse("2014-10-11"), "login01");
        Order courgette = new Order(18.4, LocalDate.parse("2015-10-11"), "login02");
        Order parsley = new Order(12.6, LocalDate.parse("2016-10-11"), "login03");
        Order beetroot = new Order(32.4, LocalDate.parse("2017-10-11"), "login04");
        Order celery = new Order(13.4, LocalDate.parse("2018-10-11"), "login05");

    @Test
    void shouldReturnSizeFiveWhenFiveOrdersAdded() {
        //given
        //when
        int result = shop.getSize();
        //then
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void shouldReturnCorrectSetForDatesBetweenGivenDates() {
        //given
        //when
        Set<Order> resultOrders;
        resultOrders = shop.getOrdersOnDatesFromTo(LocalDate.parse("2015-05-05"), LocalDate.parse("2017-01-01"));
        //then
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(18.4, LocalDate.parse("2015-10-11"), "login02"));
        expected.add(new Order(12.6, LocalDate.parse("2016-10-11"), "login03"));
        assertEquals(expected, resultOrders);
    }

    @Test
    void shouldReturnCorrectSetForDatesBetweenGivenDatesWithLimits() {
        //given
        //when
        Set<Order> resultOrders;
        resultOrders = shop.getOrdersOnDatesFromTo(LocalDate.parse("2015-10-11"), LocalDate.parse("2016-10-11"));
        //then
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(18.4, LocalDate.parse("2015-10-11"), "login02"));
        expected.add(new Order(12.6, LocalDate.parse("2016-10-11"), "login03"));
        assertEquals(expected, resultOrders);
    }

    @Test
    void shouldReturnCorrectSetForValuesBetweenGivenValues() {
        //given
        //when
        Set<Order> resultOrders;
        resultOrders = shop.getOrdersOnOrderValuesFromTo(13, 20);
        //then
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(18.4, LocalDate.parse("2015-10-11"), "login02"));
        expected.add(new Order(13.4, LocalDate.parse("2018-10-11"), "login05"));
        assertEquals(expected, resultOrders);
    }

    @Test
    void shouldReturnCorrectSetForValuesBetweenGivenValuesWithLimits() {
        //given
        //when
        Set<Order> resultOrders;
        resultOrders = shop.getOrdersOnOrderValuesFromTo(13.4, 18.4);
        //then
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(18.4, LocalDate.parse("2015-10-11"), "login02"));
        expected.add(new Order(13.4, LocalDate.parse("2018-10-11"), "login05"));
        assertEquals(expected, resultOrders);
    }

    @Test
    void shouldReturnCorrectValueOfAllOrders() {
        //given
        //when
        double result = shop.getValueOfAllOrders();
        //then
        double expected = 89.2;
        assertEquals(expected, result, 0.001);
    }

    @BeforeEach
    void intializeShopWithOrders() {
        shop.addOrder(carrot);
        shop.addOrder(courgette);
        shop.addOrder(parsley);
        shop.addOrder(beetroot);
        shop.addOrder(celery);
    }

}