package com.kodilla.homework;

public class InvalidNumbersException extends Exception {
    public InvalidNumbersException() {
        super("Wrong numbers provided");
    }
}