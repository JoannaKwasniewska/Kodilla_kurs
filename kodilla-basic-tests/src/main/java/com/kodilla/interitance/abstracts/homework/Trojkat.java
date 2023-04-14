package com.kodilla.interitance.abstracts.homework;

public class Trojkat extends Shape{

    private  int a;

    private int b;
    private int c;
    private int h;


    public Trojkat(int a, int h, int b, int c) {

    }

    {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }


    @Override
    public int pole() {
        return a/2*h;
    }

    @Override
    public int obw() {
        return a+b+c;
    }
}
