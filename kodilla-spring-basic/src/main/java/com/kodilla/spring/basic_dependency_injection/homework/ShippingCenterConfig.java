package com.kodilla.spring.basic_dependency_injection.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShippingCenterConfig {

    @Bean
    public DeliveryService deliveryService() {
        return new DeliveryService();
    }

    @Bean
    public NotificationService notificationService() {
        return new NotificationService();
    }

    @Bean
    public ShippingCenter shippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        return new ShippingCenter(deliveryService, notificationService);
    }
}
