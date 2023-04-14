package com.kodilla.interitance.abstracts.homeworkjob;

public class Secretary extends Job {

    public Secretary(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void performJob() {
        System.out.println("As a secretary I pickup the phones and arrange a business meeting");
    }
}
