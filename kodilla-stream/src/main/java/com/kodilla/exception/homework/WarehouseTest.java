package com.kodilla.exception.homework;

import org.junit.Assert;
import org.junit.Test;
public class WarehouseTest {
    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrderForNonExistingOrder() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));

        // when
        warehouse.getOrder("4"); // Wyszukiwanie nieistniejącego zamówienia powinno rzucić wyjątkiem

        // then
        // Jeśli wyjątek został rzucany, test zakończy się sukcesem
    }
}
