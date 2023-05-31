package com.kodilla.homework.parametrized_tests;

import java.time.LocalDate;

public class Order {
    private double orderValue;
    private LocalDate date;
    private String username;

    public Order(double orderValue, LocalDate date, String username) {
        this.orderValue = orderValue;
        this.date = date;
        this.username = username;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }
}