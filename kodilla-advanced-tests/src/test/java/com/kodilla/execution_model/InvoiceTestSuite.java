package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item computer = new Item("computer", 2300);
    Item laptop = new Item("laptop", 3400);
    Item mouse = new Item("mouse", 25);
    Item printer = new Item("printer", 1200);

    @BeforeEach
    void initializeInvoice() {
        invoice.addItem(computer);
        invoice.addItem(laptop);
        invoice.addItem(mouse);
        invoice.addItem(printer);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
    @Test
    void shouldReturnTwoWhenTwoItemsAdded() {
        //given

        //when
        int result = invoice.getSize();
        //then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnCorrectNameAndPriceFromFewItems() {
        //given

        //when
        String resultName = invoice.getItem(1).getName();
        double resultPrice = invoice.getItem(1).getPrice();
        //then
        assertEquals("laptop", resultName);
        assertEquals(3400, resultPrice);
    }

    @Test
    void shouldReturnNullWhenIndexIsNegative() {
        //given

        //when
        Item item = invoice.getItem(-5);
        //then
        assertNull(item);
    }

    @Test
    void shouldReturnNullWhenIndexIsBigPositive() {
        //given

        //when
        Item item = invoice.getItem(25);
        //then
        assertNull(item);
    }

    @Test
    void shouldReturnZeroWhenInvoiceIsEmpty() {
        //given

        //when
        invoice.clear();
        int resultSize = invoice.getSize();
        //then
        assertEquals(0, resultSize);
    }
}