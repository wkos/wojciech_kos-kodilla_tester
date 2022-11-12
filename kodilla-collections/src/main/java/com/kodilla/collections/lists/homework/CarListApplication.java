package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Saab;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(0));
        cars.add(new Ford(125));
        cars.add(new Opel(0));
        cars.add(new Opel(10));
        cars.add(new Opel(20));
        cars.add(new Saab(220));

        for(Car car : cars){
            CarUtils.describeCar(car);
        }

        cars.remove(0);
        cars.remove(4);
        Ford ford = new Ford(125);
        cars.remove(ford);
        System.out.println(cars.size());
        for (Car car : cars){
            CarUtils.describeCar(car);
        }
    }
}
