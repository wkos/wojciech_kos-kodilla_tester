package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class HireCompany {
    @Bean
    public Car chooseCarType() {
        Random random = new Random();
        int season = random.nextInt(4);
        if (season == 0 || season == 2) {
            return new Sedan();
        } else if (season == 1) {
            return new Cabrio();
        } else {
            return new SUV();
        }
    }
}
