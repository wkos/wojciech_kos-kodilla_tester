package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Saab;

import java.util.Random;

public class CarApplication {
    private static final int MAX_SIZE_TABLE = 15;
    private static final int CAR_MAKES_NUMBER = 3;
    private static final int MAX_CAR_SPEED_INCREASE = 40;
    private static final int INITIAL_SPEED = 0;

    private static Random random = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[random.nextInt(MAX_SIZE_TABLE)];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for(Car car: cars){
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar(){
        int careMakeId = random.nextInt(CAR_MAKES_NUMBER);
        switch (careMakeId){
            case 0: {
                return generateSpecificCar(new Ford(INITIAL_SPEED));
            }
            case 1: {
                return generateSpecificCar(new Opel(INITIAL_SPEED));
            }
            case 2: {
                return generateSpecificCar(new Saab(INITIAL_SPEED));
            }
            default: return null;
        }
    }


    private static Car generateSpecificCar(Car car){
        Random random = new Random();
        int speedIncrease = random.nextInt(MAX_CAR_SPEED_INCREASE) + 1;
        car.increaseSpeedBy(speedIncrease);
        return car;
    }
}
