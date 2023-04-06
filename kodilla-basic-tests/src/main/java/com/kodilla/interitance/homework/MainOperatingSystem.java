package com.kodilla.interitance.homework;


public class MainOperatingSystem {
    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(2004);
        system.showYear();
        OwcaCwel owcaCwel = new OwcaCwel(123);
        owcaCwel.showYear();
        LisCwel lisCwel = new LisCwel(1234);
        lisCwel.showYear();

    }
}
