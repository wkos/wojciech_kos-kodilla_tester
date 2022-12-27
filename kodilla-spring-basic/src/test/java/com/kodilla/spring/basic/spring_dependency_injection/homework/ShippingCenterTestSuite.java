package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShippingCenterTestSuite {
    @Test
    public void shouldReturnDeliveredMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Zielona 13", 35);
        Assertions.assertEquals("Package not delivered to: Zielona 13", result);
    }

    @Test
    public void shouldReturnNotDeliveredMessage(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Zielona 22", 12);
        Assertions.assertEquals("Package delivered to: Zielona 22", result);
    }

    @Test
    public void shouldReturnDeliveredMessageForWeightThirty(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Zielona 13", 30);
        Assertions.assertEquals("Package delivered to: Zielona 13", result);
    }
}
