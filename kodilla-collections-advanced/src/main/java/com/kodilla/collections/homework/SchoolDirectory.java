package com.kodilla.collections.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();

        Principal principal1 = new Principal("Jan Kowalski");
        Principal principal2 = new Principal("Stefan Nowak");
        Principal principal3 = new Principal("Jacek Placek");

        School school1 = new School();
        school1.addStudentsCount(25);
        school1.addStudentsCount(30);
        school1.addStudentsCount(28);

        School school2 = new School();
        school2.addStudentsCount(20);
        school2.addStudentsCount(18);
        school2.addStudentsCount(22);
        school2.addStudentsCount(24);

        School school3 = new School();
        school3.addStudentsCount(15);
        school3.addStudentsCount(16);

        schoolMap.put(principal1, school1);
        schoolMap.put(principal2, school2);
        schoolMap.put(principal3, school3);

        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();

            System.out.println("Principal: " + principal.getName());
            System.out.println("School: " + school);
            System.out.println("Total students: " + school.getTotalStudentsCount());
            System.out.println();
        }

    }
}
