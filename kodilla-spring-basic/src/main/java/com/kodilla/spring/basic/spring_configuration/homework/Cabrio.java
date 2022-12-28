package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        return time.isAfter(LocalTime.of(19,59,59,999999999))
                || time.isBefore(LocalTime.of(6, 0, 0, 0));
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
