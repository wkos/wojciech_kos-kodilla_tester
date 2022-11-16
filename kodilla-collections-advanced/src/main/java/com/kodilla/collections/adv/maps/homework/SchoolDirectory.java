package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolPrincipals = new HashMap<>();
        Principal principal1 = new Principal("John", "Doe");
        Principal principal2 = new Principal("Margaret", "Thacher");
        Principal principal3 = new Principal("Bill", "Forest");

        School school1 = new School("primary", Arrays.asList(15, 17, 22));
        School school2 = new School("secondary", Arrays.asList(13, 12, 18));
        School school3 = new School("nursery school", Arrays.asList(9, 8, 12));

        schoolPrincipals.put(principal1, school1);
        schoolPrincipals.put(principal2, school2);
        schoolPrincipals.put(principal3, school3);

        for(Map.Entry<Principal, School> school : schoolPrincipals.entrySet()){
            System.out.println(school.getKey() + ", " + school.getValue());
        }
    }
}
