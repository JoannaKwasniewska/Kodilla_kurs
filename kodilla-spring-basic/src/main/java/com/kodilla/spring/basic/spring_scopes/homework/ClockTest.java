package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class ClockTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testClocksHaveDifferentTimes() {
        Clock clock1 = applicationContext.getBean(Clock.class);
        Clock clock2 = applicationContext.getBean(Clock.class);

        assertNotEquals(clock1.getCurrentTime(), clock2.getCurrentTime());
    }
}