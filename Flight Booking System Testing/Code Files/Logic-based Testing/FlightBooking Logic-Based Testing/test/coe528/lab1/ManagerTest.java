package coe528.lab1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ManagerTest {

    private Manager manager;
    private Flight flight1;
    private Flight flight2;

    @Before
    public void setUp() {
        manager = new Manager();

        flight1 = new Flight(201, "Toronto", "London", "9:00 AM", 3, 600.0);
        flight2 = new Flight(202, "Toronto", "London", "9:00 AM", 1, 500.0);
        flight2.bookASeat(); // no seats left

        manager.createFlights(flight1);
        manager.createFlights(flight2);
    }

    // Simulated logic for testing since displayAvailableFlights() prints instead of returns
    public List<Flight> filterFlights(String origin, String destination) {
        List<Flight> available = new ArrayList<>();
        for (Flight f : manager.getFlights()) {
            if (f.getOrigin().equals(origin) &&
                f.getDestination().equals(destination) &&
                f.getNumberOfSeatsLeft() > 0) {
                available.add(f);
            }
        }
        return available;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    @Test
    public void testAvailableFlightDisplayed() {
        List<Flight> result = filterFlights("Toronto", "London");
        assertEquals(1, result.size());
        assertEquals(flight1, result.get(0));
    }

    @Test
    public void testUnavailableFlightFilteredOut() {
        List<Flight> result = filterFlights("Toronto", "London");
        assertFalse(result.contains(flight2));
    }

    @Test
    public void testWrongDestinationNotIncluded() {
        List<Flight> result = filterFlights("Toronto", "Paris");
        assertEquals(0, result.size());
    }
}

