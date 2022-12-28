package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class HierCompanyTestSuite {
    @Test
    public void shouldReturnCorrectCarType(){
        // przetestowane dla 10 prób
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        String carType = car.getCarType();
        System.out.println(carType);
        //then
        List<String> carTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(carTypes.contains(carType));
    }

    @Test
    public void shouldBeLightsTurnedOnWhenJustEightPM(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn(LocalTime.of(20, 0, 0, 0));
        //then
        Assertions.assertTrue(lightsOn);
    }

    @Test
    public void shouldBeLightsTurnedOnWhenJustBeforeSixAM(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn(LocalTime.of(5, 59, 59, 999999999));
        //then
        Assertions.assertTrue(lightsOn);
    }

    @Test
    public void shouldBeLightsTurnedOnWhenTenPM(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn(LocalTime.of(22, 0, 0, 0));
        //then
        Assertions.assertTrue(lightsOn);
    }

    @Test
    public void shouldBeLightsTurnedOnWhenFourAM(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn(LocalTime.of(4, 0, 0, 0));
        //then
        Assertions.assertTrue(lightsOn);
    }

    @Test
    public void shouldBeLightsTurnedOffWhenJustBeforeEightPM(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn(LocalTime.of(19, 59, 59, 999999999));
        //then
        Assertions.assertFalse(lightsOn);
    }

    @Test
    public void shouldBeLightsTurnedOffWhenJustSixAM(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn(LocalTime.of(6, 0, 0, 0));
        //then
        Assertions.assertFalse(lightsOn);
    }

    @Test
    public void shouldBeLightsTurnedOffWhenElevenAM(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn(LocalTime.of(11, 0, 0, 0));
        //then
        Assertions.assertFalse(lightsOn);
    }

    @Test
    public void shouldBeLightsTurnedOffWhenSixPM(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("chooseCarType");
        //when
        boolean lightsOn = car.hasHeadlightsTurnedOn(LocalTime.of(18, 0, 0, 0));
        //then
        Assertions.assertFalse(lightsOn);
    }
}
