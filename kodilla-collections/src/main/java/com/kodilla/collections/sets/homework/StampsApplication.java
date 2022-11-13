package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Mieszko I", 20, 30, true));
        stamps.add(new Stamp("Mieszko I", 20, 30, true));
        stamps.add(new Stamp("Mieszko II", 20, 30, true));
        stamps.add(new Stamp("Mieszko III", 20, 30, true));
        stamps.add(new Stamp("Mieszko I", 20, 30, false));
        stamps.add(new Stamp("Mieszko I", 20, 30, true));
        System.out.println(stamps.size());
        for(Stamp stamp : stamps){
            System.out.println(stamp);
        }
    }
}
