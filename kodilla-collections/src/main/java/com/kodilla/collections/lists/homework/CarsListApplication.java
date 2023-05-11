package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.Car;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;

public class CarsListApplication {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("Ford", 180);
        Car car2 = new Car("BMW", 220);
        Car car3 = new Car("Audi", 200);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("Initial collection:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(1); // Remove car at index 1

        Car carToRemove = car3; // Car to remove
        cars.remove(carToRemove);

        System.out.println("\nCollection after removal:");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println("Collection size: " + cars.size());
    }
}