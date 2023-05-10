package com.kodilla.collections.interfaces.homework;

class CarRace {
    public static void main(String[] args) {
        Car ford = (Car) new Ford();
        Car opel = (Car) new Opel();
        Car audi = (Car) new Audi();

        doRace(ford);
        doRace(opel);
        doRace(audi);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Final speed: " + car.getSpeed());
    }
}
