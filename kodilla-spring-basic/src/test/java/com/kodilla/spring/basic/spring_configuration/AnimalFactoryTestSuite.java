package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class AnimalFactoryTestSuite {
    //ten test nie przejdzie przez random, bo będą dwa beany jeśli wylosuje doga i nie wiadomo, którego wybrać.
//    @Test
//    public void testDogCreated(){
//        //given
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Dog dog = context.getBean(Dog.class);
//        //when
//        String voice = dog.getVoice();
//        //then
//        Assertions.assertEquals("Bark bark", voice);
//    }

    @Test
    public void  shouldCreateDobBeanAndFetchByBeanName(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Dog dog = (Dog) context.getBean("createDog");
        //when
        String voice = dog.getVoice();
        //then
        Assertions.assertEquals("Bark bark", voice);
    }

    @Test
    public void shouldCreateRandomAnimal(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Animal animal = (Animal) context.getBean("randomAnimal");
        //when
        String voice = animal.getVoice();
        System.out.println(voice);
        //then
        List<String> possibleVoices = Arrays.asList("Bark bark", "Meou meou", "Quack quack");
        Assertions.assertTrue(possibleVoices.contains(voice));
    }
}
