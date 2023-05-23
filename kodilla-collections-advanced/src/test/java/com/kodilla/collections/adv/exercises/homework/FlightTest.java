package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FlightTest {
    private List<Flight> flights = FlightRepository.getFlightsTable();
    private FlightFinder flightFinder = new FlightFinder(flights);

    @Test
    public void testFindFlightsFrom() {
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom("Warsaw");
        Assertions.assertEquals(2, flightsFromWarsaw.size());
        Assertions.assertEquals("Warsaw", flightsFromWarsaw.get(0).getDeparture());
        Assertions.assertEquals("Paris", flightsFromWarsaw.get(0).getArrival());
        Assertions.assertEquals("Warsaw", flightsFromWarsaw.get(1).getDeparture());
        Assertions.assertEquals("London", flightsFromWarsaw.get(1).getArrival());

        List<Flight> flightsFromLondon = flightFinder.findFlightsFrom("London");
        Assertions.assertEquals(1, flightsFromLondon.size());
        Assertions.assertEquals("London", flightsFromLondon.get(0).getDeparture());
        Assertions.assertEquals("Sydney", flightsFromLondon.get(0).getArrival());
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> flightsToSydney = flightFinder.findFlightsTo("Sydney");
        Assertions.assertEquals(1, flightsToSydney.size());
        Assertions.assertEquals("London", flightsToSydney.get(0).getDeparture());
        Assertions.assertEquals("Sydney", flightsToSydney.get(0).getArrival());

        List<Flight> flightsToParis = flightFinder.findFlightsTo("Paris");
        Assertions.assertEquals(1, flightsToParis.size());
        Assertions.assertEquals("Warsaw", flightsToParis.get(0).getDeparture());
        Assertions.assertEquals("Paris", flightsToParis.get(0).getArrival());
    }
}
