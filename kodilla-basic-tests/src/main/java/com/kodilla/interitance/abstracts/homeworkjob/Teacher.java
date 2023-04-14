package com.kodilla.interitance.abstracts.homeworkjob;

public class Teacher extends Job {

    public Teacher(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void performJob() {
        System.out.println("As a teacher, I teach my students maths and physics.");
    }
}
