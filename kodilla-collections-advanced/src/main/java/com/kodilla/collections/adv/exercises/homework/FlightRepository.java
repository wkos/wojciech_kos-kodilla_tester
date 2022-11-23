package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    static Map<String, Set<Flight>> airports = new HashMap<>();

    public static void addFlight(String from, String to){
        Set<Flight> flights = airports.getOrDefault(from, new HashSet<>());
        Flight flight = new Flight(from, to);
        flights.add(flight);
        airports.put(from, flights);
    }

    public static Set<Flight> getFlightsTable(String from){
        return airports.get(from);
    }
}
