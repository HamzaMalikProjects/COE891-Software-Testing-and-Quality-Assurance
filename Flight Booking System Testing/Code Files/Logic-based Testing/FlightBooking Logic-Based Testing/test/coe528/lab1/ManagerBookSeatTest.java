package coe528.lab1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ManagerBookSeatTest {

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager();
    }

    @Test
    public void testBookingSuccess() {
        Flight flight = new Flight(301, "Toronto", "NYC", "10:00 AM", 5, 400.0);
        manager.createFlights(flight);
        Passenger p = new Member("Ali", 30, 2);
        manager.bookSeat(301, p);
        assertEquals(1, p.getTickets().size());
    }

    @Test
    public void testBookingNoSeatsLeft() {
        Flight flight = new Flight(302, "Toronto", "NYC", "11:00 AM", 1, 400.0);
        flight.bookASeat(); // seat becomes 0
        manager.createFlights(flight);
        Passenger p = new Member("Sara", 25, 1);
        manager.bookSeat(302, p);
        assertEquals(0, p.getTickets().size());
    }

    @Test
    public void testBookingFlightNotFound() {
        Passenger p = new Member("John", 40, 5);
        manager.bookSeat(999, p); // no such flight
        assertEquals(0, p.getTickets().size());
    }
}
