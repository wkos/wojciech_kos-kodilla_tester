package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Saab;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("----------------------------");
        System.out.println("Car make: " + getCarMake(car));
        System.out.println("Current car speed: " + car.getSpeed());
    }

    private static String getCarMake(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Saab)
            return "Saab";
        else
            return "Unknown car make";
    }
}
