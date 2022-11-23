package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    public Set<Flight> findFlightsFrom(String departure){
        return FlightRepository.getFlightsTable(departure);
    }

    public Set<Flight> findFlightsTo(String arrival){
        Set<Flight> flightsTo = new HashSet<>();
        for(Map.Entry<String, Set<Flight>> flights : FlightRepository.airports.entrySet()){
            for(Flight flight : flights.getValue()){
                if(flight.getArrival().equals(arrival)){
                    flightsTo.add(flight);
                }
            }
        }
        return flightsTo;
    }
}
