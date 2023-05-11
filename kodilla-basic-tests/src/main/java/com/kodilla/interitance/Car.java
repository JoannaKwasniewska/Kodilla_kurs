package com.kodilla.interitance;

public class Car {
    private int _wheels;
    private int _seats;

    public Car(){
        System.out.println("Car konstruktor");
    }
    public Car(int amount){
        _seats = amount;
        System.out.println("konstruktor parametryczny");
    }
    public Car(int amount, int wheels){
        _seats = amount;
        _wheels = wheels;
        System.out.println("2 parmy");
    }

    public int getSeats() {
        return _seats;
    }

    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }
    public void openDoors() {
        System.out.println("Otfuf 4 dźwi");
    }
    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + _seats);
    }
}