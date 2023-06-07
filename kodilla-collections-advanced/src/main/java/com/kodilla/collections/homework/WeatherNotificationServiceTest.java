package com.kodilla.collections.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class WeatherNotificationServiceTest {

    @Test
    public void shouldAddSubscriberToLocation() {
        // given
        WeatherNotificationService service = new WeatherNotificationService();
        WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
        service.setWeatherClient(weatherClient);
        Location location = new Location("New York");

        // when
        service.addSubscriber(location, "John");
        Subscriber subscriber = service.getSubscribers().get(location);

        // then
        assertEquals(1, service.getSubscribers().size());
        assertEquals("John", subscriber.getName());
    }

    @Test
    public void shouldRemoveSubscriberFromLocation() {
        // given
        WeatherNotificationService service = new WeatherNotificationService();
        WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
        service.setWeatherClient(weatherClient);
        Location location = new Location("London");
        service.addSubscriber(location, "Alice");

        // when
        service.removeSubscriber(location, "Alice");

        // then
        assertEquals(0, service.getSubscribers().size());
    }

    @Test
    public void shouldRemoveSubscriberFromAllLocations() {
        // given
        WeatherNotificationService service = new WeatherNotificationService();
        WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
        service.setWeatherClient(weatherClient);
        Location location1 = new Location("Paris");
        Location location2 = new Location("Berlin");
        service.addSubscriber(location1, "Bob");
        service.addSubscriber(location2, "Bob");

        // when
        service.removeSubscriberFromAllLocations("Bob");

        // then
        assertEquals(0, service.getSubscribers().size());
    }

    @Test
    public void shouldSendNotificationToAllSubscribers() {
        // given
        WeatherNotificationService service = new WeatherNotificationService();
        WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
        service.setWeatherClient(weatherClient);
        Location location = new Location("Tokyo");
        service.addSubscriber(location, "Mary");
        service.addSubscriber(location, "Kate");

        // when
        service.sendNotificationToAll("New regulation");

        // then
        verify(weatherClient, times(1)).sendNotification("Mary", "New regulation");
        verify(weatherClient, times(1)).sendNotification("Kate", "New regulation");
    }

    @Test
    public void shouldSendNotificationToLocationSubscribers() {
        // given
        WeatherNotificationService service = new WeatherNotificationService();
        WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
        service.setWeatherClient(weatherClient);
        Location location1 = new Location("Rome");
        Location location2 = new Location("Madrid");
        service.addSubscriber(location1, "Tom");
        service.addSubscriber(location1, "Jerry");
        service.addSubscriber(location2, "Tom");

        // when
        service.sendNotificationToLocation(location1, "Hailstorm incoming");

        // then
        verify(weatherClient, times(1)).sendNotification("Tom", "Hailstorm incoming");
        verify(weatherClient, times(1)).sendNotification("Jerry", "Hailstorm incoming");
        verify(weatherClient, never()).sendNotification(eq("Tom"), eq("Hailstorm incoming"));
    }
}
