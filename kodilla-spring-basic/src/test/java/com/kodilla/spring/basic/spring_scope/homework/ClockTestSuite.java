package com.kodilla.spring.basic.spring_scope.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClockTestSuite {
    @Test
    public void shouldCreateDifferentBeans(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);
        Clock fourthBean = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
        Assertions.assertNotEquals(firstBean, fourthBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(secondBean, fourthBean);
        Assertions.assertNotEquals(thirdBean, fourthBean);
    }
    @Test
    public void shouldReturnDifferentTimes() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        System.out.println(firstBean.getTime());
        Thread.sleep(1L);
        Clock secondBean = context.getBean(Clock.class);
        System.out.println(secondBean.getTime());
        Thread.sleep(1L);
        Clock thirdBean = context.getBean(Clock.class);
        System.out.println(thirdBean.getTime());
        Thread.sleep(1L);
        Clock fourthBean = context.getBean(Clock.class);
        System.out.println(fourthBean.getTime());

        Assertions.assertNotEquals(firstBean.getTime(), secondBean.getTime());
        Assertions.assertNotEquals(firstBean.getTime(), thirdBean.getTime());
        Assertions.assertNotEquals(firstBean.getTime(), fourthBean.getTime());
        Assertions.assertNotEquals(secondBean.getTime(), thirdBean.getTime());
        Assertions.assertNotEquals(secondBean.getTime(), fourthBean.getTime());
        Assertions.assertNotEquals(thirdBean.getTime(), fourthBean.getTime());
    }
}