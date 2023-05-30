package com.kodilla.homeworkTEST;

import com.kodilla.homework.parametrized_tests.Order;
import com.kodilla.homework.parametrized_tests.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {

    private Shop shop;

    @BeforeEach
    void setUp() {
        shop = new Shop();
        shop.addOrder(new Order(100.0, LocalDate.of(2023, 5, 1), "user1"));
        shop.addOrder(new Order(200.0, LocalDate.of(2023, 5, 2), "user2"));
        shop.addOrder(new Order(150.0, LocalDate.of(2023, 5, 3), "user3"));
        shop.addOrder(new Order(300.0, LocalDate.of(2023, 5, 4), "user4"));
    }

    @Test
    void shouldReturnOrdersInRange() {
        // Given
        LocalDate startDate = LocalDate.of(2023, 5, 2);
        LocalDate endDate = LocalDate.of(2023, 5, 3);

        // When
        List<Order> ordersInRange = shop.getOrdersInRange(startDate, endDate);

        // Then
        assertEquals(2, ordersInRange.size());
    }

    @Test
    void shouldReturnOrdersByValueRange() {
        // Given
        double minValue = 150.0;
        double maxValue = 300.0;

        // When
        List<Order> ordersByValueRange = shop.getOrdersByValueRange(minValue, maxValue);

        // Then
        assertEquals(3, ordersByValueRange.size());
    }

    @Test
    void shouldReturnNumberOfOrders() {
        // When
        int numberOfOrders = shop.getNumberOfOrders();

        // Then
        assertEquals(4, numberOfOrders);
    }

    @Test
    void shouldReturnTotalOrderValue() {
        // When
        double totalOrderValue = shop.getTotalOrderValue();

        // Then
        assertEquals(750.0, totalOrderValue);
    }
}