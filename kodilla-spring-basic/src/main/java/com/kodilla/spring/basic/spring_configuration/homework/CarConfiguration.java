package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.homework.Car;
import com.kodilla.spring.basic.spring_configuration.homework.Cabrio;
import com.kodilla.spring.basic.spring_configuration.homework.SUV;
import com.kodilla.spring.basic.spring_configuration.homework.Sedan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarConfiguration {

    @Bean
    public Car car() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        if (now.getMonth().getValue() == 12 && (hour >= 0 && hour < 6)) {
            return new SUV();
        } else if (now.getMonth().getValue() >= 3 && now.getMonth().getValue() <= 5) {
            return new Sedan();
        } else if (now.getMonth().getValue() >= 6 && now.getMonth().getValue() <= 8) {
            return new Cabrio();
        } else if (now.getMonth().getValue() >= 9 && now.getMonth().getValue() <= 11) {
            return new Sedan();
        } else {
            return new SUV();
        }
    }
}