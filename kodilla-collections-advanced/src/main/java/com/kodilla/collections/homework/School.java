package com.kodilla.collections.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class School {
    private List<Integer> studentsCount = new ArrayList<>();

    public void addStudentsCount(int count) {
        studentsCount.add(count);
    }

    public int getTotalStudentsCount() {
        int total = 0;
        for (int count : studentsCount) {
            total += count;
        }
        return total;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsCount=" + studentsCount +
                '}';
    }
}
