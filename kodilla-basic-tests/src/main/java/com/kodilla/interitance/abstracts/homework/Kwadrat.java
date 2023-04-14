package com.kodilla.interitance.abstracts.homework;

public class Kwadrat extends Shape{

    private  int a;


    public Kwadrat(int a){
        this.a = a;
    }
    @Override
    public int pole() {
        return a*a;
    }

    @Override
    public int obw() {
        return 4*a;
    }
}
