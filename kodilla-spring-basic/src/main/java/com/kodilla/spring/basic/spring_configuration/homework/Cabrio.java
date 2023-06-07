package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        int hour = java.time.LocalTime.now().getHour();
        return hour >= 20 || hour < 6;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
