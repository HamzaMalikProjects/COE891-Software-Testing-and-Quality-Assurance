package coe528.lab1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ManagerGetFlightTest {

    private Manager manager;
    private Flight flight;

    @Before
    public void setUp() {
        manager = new Manager();
        flight = new Flight(101, "Toronto", "London", "9:00 AM", 5, 600.0);
        manager.createFlights(flight);
    }

    @Test
    public void testFlightFound() {
        Flight result = manager.getFlight(101);
        assertNotNull(result);
        assertEquals(flight, result);
    }

    @Test
    public void testFlightNotFound() {
        Flight result = manager.getFlight(999);
        assertNull(result);
    }
}
