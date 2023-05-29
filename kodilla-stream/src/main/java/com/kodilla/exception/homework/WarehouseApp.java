package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Dodanie kilku zamówień do hurtowni
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

        // Wyszukiwanie nieistniejącego zamówienia
        String orderNumber = "4";
        try {
            Order order = warehouse.getOrder(orderNumber);
            System.out.println("Found order: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }
}
