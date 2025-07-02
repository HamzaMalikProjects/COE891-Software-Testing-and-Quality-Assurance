package main;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TicketTest {
    private Passenger passenger;
    private Flight flight;
    private Ticket ticket;

    @Before
    public void setUp() {
        passenger = new Member("John Doe", 35, 3);
        flight = new Flight(123, "New York", "London", "10:00", 100, 500.0);
        ticket = new Ticket(passenger, flight, 450.0); // 10% discount
    }

    @Test
    public void testToString() {
        String result = ticket.toString();
        assertTrue(result.contains("Name: John Doe"));
        assertTrue(result.contains("Flight Number: 123"));
        assertTrue(result.contains("New York"));
        assertTrue(result.contains("London"));
        assertTrue(result.contains("10:00"));
        assertTrue(result.contains("500.0")); // Original price
        assertTrue(result.contains("450.0")); // Discounted price
    }
}