package com.kodilla.collections.sets.homework;

import java.util.HashSet;

public class StampsApplication {
    public static void main(String[] args) {
        HashSet<Stamp> stamps = new HashSet<>();

        Stamp stamp1 = new Stamp("Butterfly", "2x2", true);
        Stamp stamp2 = new Stamp("Flower", "3x3", false);
        Stamp stamp3 = new Stamp("Butterfly", "2x2", true);

        stamps.add(stamp1);
        stamps.add(stamp2);
        stamps.add(stamp3);

        System.out.println("Number of stamps: " + stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}