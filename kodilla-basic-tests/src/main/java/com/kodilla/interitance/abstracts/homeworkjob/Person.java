package com.kodilla.interitance.abstracts.homeworkjob;

public class Person {

    private String firstName;
    private int age;
    private Job job;



    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }


    public void showResponsibilities() {
        System.out.println(firstName + "'s responsibilities at work are:");
        System.out.println(job.getResponsibilities());
    }

    public void showSalary() {
        System.out.println(firstName + "'s salary is");
        System.out.println(job.getSalary());

    }
}
