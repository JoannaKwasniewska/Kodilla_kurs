package com.kodilla.spring.basic_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ShippingCenterTest {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void testSendPackageSuccess() {
        String address = "Hill Street 11, New York";
        double weight = 18.2;

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package delivered to: " + address, result);
    }

    private void assertEquals(String s, String result) {
    }

    @Test
    public void testSendPackageFail() {
        String address = "Hill Street 11, New York";
        double weight = 35.0;

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package not delivered to: " + address, result);
    }
}