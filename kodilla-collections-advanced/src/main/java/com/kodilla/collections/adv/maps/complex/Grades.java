package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    List<Double> grades = new ArrayList<>();

    public Grades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverage(){
        double sum = 0.0;
        for(Double grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Grades:" + grades.toString();
    }
}
