package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFlightFinderFrom(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        FlightRepository.addFlight("Warsaw", "Krakow");
        FlightRepository.addFlight("Warsaw", "Poznan");
        FlightRepository.addFlight("Poznan", "Wroclaw");
        //when
        Set<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        //then
        Set<Flight> expectedList = new HashSet<>();
        expectedList.add(new Flight("Warsaw", "Krakow"));
        expectedList.add(new Flight("Warsaw", "Poznan"));
        assertEquals(expectedList,result);
    }

    @Test
    public void testFlightFinderTo(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        FlightRepository.addFlight("Warsaw", "Krakow");
        FlightRepository.addFlight("Warsaw", "Poznan");
        FlightRepository.addFlight("Poznan", "Wroclaw");
        FlightRepository.addFlight("Prague", "Krakow");
        FlightRepository.addFlight("Bern", "Krakow");
        //when
        Set<Flight> result = flightFinder.findFlightsTo("Krakow");
        //then
        Set<Flight> expectedList = new HashSet<>();
        expectedList.add(new Flight("Warsaw", "Krakow"));
        expectedList.add(new Flight("Prague", "Krakow"));
        expectedList.add(new Flight("Bern", "Krakow"));
        assertEquals(expectedList, result);
    }
}