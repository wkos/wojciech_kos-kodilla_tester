package com.kodilla.parmetrized_tests.homework;

import java.math.BigDecimal;

public class Person {
    private BigDecimal heightInMeters;
    private BigDecimal weightInKilogram;

    public Person(BigDecimal heightInMeters, BigDecimal weightInKilogram) {
        this.heightInMeters = heightInMeters;
        this.weightInKilogram = weightInKilogram;
    }

    public String getBMI() {
        BigDecimal bmi = weightInKilogram.divide(heightInMeters.multiply(heightInMeters));
        if (bmi.compareTo(BigDecimal.valueOf(15)) < 0) {
            return "Very severely underweight";
        } else if (bmi.compareTo(BigDecimal.valueOf(16)) < 0) {
            return "Severely underweight";
        } else if (bmi.compareTo(BigDecimal.valueOf(18.5)) < 0) {
            return "Underweight";
        } else if (bmi.compareTo(BigDecimal.valueOf(25)) < 0) {
            return "Normal (healthy weight)";
        } else if (bmi.compareTo(BigDecimal.valueOf(30)) < 0) {
            return "Overweight";
        } else if (bmi.compareTo(BigDecimal.valueOf(35)) < 0) {
            return "Obese Class I (Moderately obese)";
        } else if (bmi.compareTo(BigDecimal.valueOf(40)) < 0) {
            return "Obese Class II (Severely obese)";
        } else if (bmi.compareTo(BigDecimal.valueOf(45)) < 0) {
            return "Obese Class III (Very severely obese)";
        } else if (bmi.compareTo(BigDecimal.valueOf(50)) < 0) {
            return "Obese Class IV (Morbidly Obese)";
        } else if (bmi.compareTo(BigDecimal.valueOf(60)) < 0) {
            return "Obese Class V (Super Obese)";
        }
        return "Obese Class VI (Hyper Obese)";
    }
}
