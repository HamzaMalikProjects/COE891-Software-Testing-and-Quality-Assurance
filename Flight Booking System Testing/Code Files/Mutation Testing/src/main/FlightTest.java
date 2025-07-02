package main;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class FlightTest {
    private Flight flight;

    @Before
    public void setUp() {
        flight = new Flight(123, "Toronto", "Vancouver", "10:00", 100, 500.00);
    }

    @Test
    public void testBookASeatSuccess() {
        int initialSeats = flight.getNumberOfSeatsLeft();
        assertTrue(flight.bookASeat());
        assertEquals(initialSeats - 1, flight.getNumberOfSeatsLeft());
    }

    @Test
    public void testBookASeatFailure() {
        flight.setNumberOfSeatsLeft(0);
        assertFalse(flight.bookASeat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSameOriginDestination() {
        new Flight(456, "Toronto", "Toronto", "12:00", 200, 600.00);
    }

    @Test
    public void testToString() {
        String expected = "Flight Number: 123; Toronto to Vancouver, 10:00; Original Price: $500.0\n";
        assertEquals(expected, flight.toString());
    }
}