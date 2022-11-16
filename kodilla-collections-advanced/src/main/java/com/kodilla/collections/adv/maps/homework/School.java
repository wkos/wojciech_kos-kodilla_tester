package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String name;
    List<Integer> headcount = new ArrayList<>();

    public School(String name, List<Integer> headcount) {
        this.name = name;
        this.headcount = headcount;
    }

    public int schoolHeadcount(){
        int sum = 0;
        for(Integer classHeadcount : headcount){
            sum += classHeadcount;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(headcount, school.headcount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, headcount);
    }

    @Override
    public String toString() {
        return "School{" +
                "name = '" + name + '\'' +
                ", school headcount = " + schoolHeadcount() +
                '}';
    }
}
