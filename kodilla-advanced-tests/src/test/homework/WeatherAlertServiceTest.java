package com.kodilla.homework.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class WeatherAlertServiceTest {

    @Mock
    private WeatherAlertSubscriber subscriber1;
    @Mock
    private WeatherAlertSubscriber subscriber2;
    @Mock
    private WeatherAlertSubscriber subscriber3;
    @Mock
    private WeatherAlertSubscriber subscriber4;

    private WeatherAlertService weatherAlertService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        weatherAlertService = new WeatherAlertService();
    }

    @Test
    public void shouldSubscribeToLocationAndReceiveAlerts() {
        // Given
        Location location = new Location("Warsaw");
        weatherAlertService.addSubscriber(subscriber1, location);
        weatherAlertService.addSubscriber(subscriber2, location);
        when(subscriber1.receiveAlert(anyString())).thenReturn(true);
        when(subscriber2.receiveAlert(anyString())).thenReturn(true);

        // When
        weatherAlertService.sendAlertToLocation("Warsaw", "Thunderstorm");

        // Then
        verify(subscriber1).receiveAlert("Thunderstorm");
        verify(subscriber2).receiveAlert("Thunderstorm");
        verify(subscriber3, never()).receiveAlert(anyString());
        verify(subscriber4, never()).receiveAlert(anyString());
    }

    @Test
    public void shouldUnsubscribeFromLocationAndNotReceiveAlerts() {
        // Given
        Location location = new Location("Krakow");
        weatherAlertService.addSubscriber(subscriber1, location);
        weatherAlertService.addSubscriber(subscriber2, location);
        weatherAlertService.addSubscriber(subscriber3, location);
        when(subscriber1.receiveAlert(anyString())).thenReturn(true);
        when(subscriber2.receiveAlert(anyString())).thenReturn(true);
        when(subscriber3.receiveAlert(anyString())).thenReturn(true);

        // When
        weatherAlertService.removeSubscriber(subscriber2, location);
        weatherAlertService.sendAlertToLocation("Krakow", "Hailstorm");

        // Then
        verify(subscriber1).receiveAlert("Hailstorm");
        verify(subscriber2, never()).receiveAlert(anyString());
        verify(subscriber3).receiveAlert("Hailstorm");
        verify(subscriber4, never()).receiveAlert(anyString());
    }

    @Test
    public void shouldUnsubscribeFromAllLocations() {
        // Given
        Location location1 = new Location("London");
        Location location2 = new Location("Paris");
        weatherAlertService.addSubscriber(subscriber1, location1);
        weatherAlertService.addSubscriber(subscriber1, location2);
        weatherAlertService.addSubscriber(subscriber2, location1);
        weatherAlertService.addSubscriber(subscriber2, location2);
        when(subscriber1.receiveAlert(anyString())).thenReturn(true);
        when(subscriber2.receiveAlert(anyString())).thenReturn(true);

        // When
        weatherAlertService.removeSubscriberFromAllLocations(subscriber1);
        weatherAlertService.sendAlertToLocation("London", "Fog");
        weatherAlertService.sendAlertToLocation("Paris", "Snow");

        // Then
        verify(subscriber1, never()).receiveAlert(anyString());
        verify(subscriber2).receiveAlert("Fog");
        verify(subscriber2).receiveAlert("Snow");
        verify(subscriber3, never()).receiveAlert(anyString());
        verify(subscriber4, never()).receiveAlert(anyString());
    }

    @Test
    public void shouldSendAlertToAllSubscribers() {
        // Given
        Location location1 = new Location("Berlin");
        Location location2 = new Location("Madrid");
        weatherAlertService.addSubscriber(subscriber1, location1);
        weatherAlertService.addSubscriber(subscriber2, location2);
        when(subscriber1.receiveAlert(anyString())).thenReturn(true);
        when(subscriber2.receiveAlert(anyString())).thenReturn(true);

        // When
        weatherAlertService.sendAlertToAllSubscribers("Tornado");

        // Then
        verify(subscriber1).receiveAlert("Tornado");
        verify(subscriber2).receiveAlert("Tornado");
        verify(subscriber3, never()).receiveAlert(anyString());
        verify(subscriber4, never()).receiveAlert(anyString());
    }

    @Test
    public void shouldRemoveLocationAndUnsubscribeSubscribers() {
        // Given
        Location location = new Location("New York");
        weatherAlertService.addSubscriber(subscriber1, location);
        weatherAlertService.addSubscriber(subscriber2, location);
        weatherAlertService.addSubscriber(subscriber3, location);
        weatherAlertService.addSubscriber(subscriber4, location);
        when(subscriber1.receiveAlert(anyString())).thenReturn(true);
        when(subscriber2.receiveAlert(anyString())).thenReturn(true);
        when(subscriber3.receiveAlert(anyString())).thenReturn(true);
        when(subscriber4.receiveAlert(anyString())).thenReturn(true);

        // When
        weatherAlertService.removeLocation(location);
        weatherAlertService.sendAlertToLocation("New York", "Heatwave");

        // Then
        verify(subscriber1, never()).receiveAlert(anyString());
        verify(subscriber2, never()).receiveAlert(anyString());
        verify(subscriber3, never()).receiveAlert(anyString());
        verify(subscriber4, never()).receiveAlert(anyString());
    }

    private static class Location {
        private final String name;

        public Location(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}