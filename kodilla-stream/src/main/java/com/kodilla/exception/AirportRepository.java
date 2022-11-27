package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOfAirports(){
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Laspalmas", true);
        airports.put("Malta", false);
        airports.put("Warsaw", true);
        return airports;
    }

    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if(getListOfAirports().containsKey(airport)){
            return getListOfAirports().get(airport);
        }
        throw new AirportNotFoundException();
    }
}
