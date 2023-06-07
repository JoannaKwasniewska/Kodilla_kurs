package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.CarConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = CarConfiguration.class)
class CarConfigurationTest {

    @Autowired
    private Car car;

    @Test
    public void testHasHeadlightsTurnedOn() {
        boolean headlightsTurnedOn = car.hasHeadlightsTurnedOn();
        assertTrue(headlightsTurnedOn);
    }

    @Test
    public void testGetCarType() {
        String carType = car.getCarType();
        assertEquals("Cabrio", carType);
    }
}
