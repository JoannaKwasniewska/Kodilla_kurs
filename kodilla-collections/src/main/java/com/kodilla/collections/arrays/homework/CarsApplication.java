package com.kodilla.collections.arrays.homework;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar() {
        Random random = new Random();
        int randomSpeed = random.nextInt(100);
        Car car = new CarImpl(randomSpeed);
        return car;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(15) + 1;
        Car[] cars = new Car[arraySize];

        for (int i = 0; i < cars.length; i++) {
            Car car = drawCar();
            cars[i] = car;
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
