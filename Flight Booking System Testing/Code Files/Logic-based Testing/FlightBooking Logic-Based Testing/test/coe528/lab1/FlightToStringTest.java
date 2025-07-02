package coe528.lab1;

import static org.junit.Assert.*;
import org.junit.Test;

public class FlightToStringTest {

    @Test
    public void testFlightToStringIncludesAllInfo() {
        Flight flight = new Flight(401, "Toronto", "Montreal", "6:00 PM", 20, 150.00);
        String result = flight.toString();

        assertTrue(result.contains("401"));         // Flight number
        assertTrue(result.contains("Toronto"));     // Origin
        assertTrue(result.contains("Montreal"));    // Destination
        assertTrue(result.contains("6:00 PM"));     // Departure time
        assertTrue(result.contains("150.0"));       // Original price
        assertTrue(result.contains("20"));          // Seats left
    }
}

