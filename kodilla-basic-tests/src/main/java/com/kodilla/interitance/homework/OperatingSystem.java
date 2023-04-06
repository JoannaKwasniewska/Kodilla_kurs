package com.kodilla.interitance.homework;

public class OperatingSystem {
 private int year;
    private void turnOn() {

    }

    private void turnOf() {

    }

    public OperatingSystem(int year){
        this.year = year;
        System.out.println("Konstruktor OperatingSystem");
    }
    public void showYear(){
        System.out.println("roczek sroczek to:" + year);
    }
}
