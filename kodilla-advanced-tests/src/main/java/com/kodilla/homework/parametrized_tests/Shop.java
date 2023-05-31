package com.kodilla.homework.parametrized_tests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders;

    public Shop() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersInRange(LocalDate startDate, LocalDate endDate) {
        List<Order> ordersInRange = new ArrayList<>();
        for (Order order : orders) {
            LocalDate orderDate = order.getDate();
            if (orderDate.isEqual(startDate) || orderDate.isEqual(endDate) ||
                    (orderDate.isAfter(startDate) && orderDate.isBefore(endDate))) {
                ordersInRange.add(order);
            }
        }
        return ordersInRange;
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        List<Order> ordersByValueRange = new ArrayList<>();
        for (Order order : orders) {
            double orderValue = order.getOrderValue();
            if (orderValue >= minValue && orderValue <= maxValue) {
                ordersByValueRange.add(order);
            }
        }
        return ordersByValueRange;
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        double totalValue = 0;
        for (Order order : orders) {
            totalValue += order.getOrderValue();
        }
        return totalValue;
    }
}
