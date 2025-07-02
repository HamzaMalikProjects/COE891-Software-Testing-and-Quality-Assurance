package main;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ManagerTest {

    private Manager manager;
    private Flight flight1, flight2, flight3;
    private Passenger passenger1, passenger2;

    @Before
    public void setUp() {
        // Initialize the manager and flights before each test
        manager = new Manager();
        
        flight1 = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 2, 652.26);
        flight2 = new Flight(1, "Vancouver", "Helsinki", "Feb 4 @ 3:00", 5, 1022.68);
        flight3 = new Flight(2, "Paris", "Barcelona", "Feb 10 @ 6:27", 0, 520.00);

        // Add flights to the manager
        manager.createFlights(flight1);
        manager.createFlights(flight2);
        manager.createFlights(flight3);
        
        passenger1 = new Member("Jenna", 32, 6); 
        passenger2 = new NonMember("Paul", 66);
    }

    @Test
    public void testCreateFlights() {
        // Test that flights are added correctly
        assertEquals(3, manager.flightArray.size());
    }

    @Test
    public void testDisplayAvailableFlights() {
        // Test displaying available flights between Toronto and London
        String result = manager.displayAvailableFlights("Toronto", "London");
        
        // Expected output: Only flight1 should be available
        assertTrue(result.contains("Feb 5 @ 8:36"));
        assertFalse(result.contains("Feb 4 @ 3:00")); // flight2 is not between Toronto and London
        assertFalse(result.contains("Feb 10 @ 6:27")); // flight3 is fully booked
    }

    @Test
    public void testGetFlight() {
        // Test getting a flight by flight number
        Flight retrievedFlight = manager.getFlight(0);
        assertNotNull(retrievedFlight);
        assertEquals(flight1, retrievedFlight);
        
        // Test getting a flight that doesn't exist
        Flight nonExistingFlight = manager.getFlight(999);
        assertNull(nonExistingFlight);
    }

    @Test
    public void testBookSeat() {
        // Test booking a seat for flight 0
        String bookingResult = manager.bookSeat(0, passenger1);
        
        // After booking, there should be only 1 seat left on flight 0
        assertEquals(1, flight1.getNumberOfSeatsLeft());
        assertTrue(bookingResult.contains("Ticket booked successfully"));
        
        // Test booking a seat for a flight that is fully booked
        String fullyBookedResult = manager.bookSeat(2, passenger2);  // flight 2 is fully booked
        assertTrue(fullyBookedResult.contains("fully booked"));
    }

    @Test
    public void testDisplayAvailableFlightsNoResults() {
        // Test when no flights match the requested origin and destination
        String result = manager.displayAvailableFlights("Albuquerque", "Athens");
        
        // Expected output: No available flights
        assertEquals("No flights available.", result);
    }

    @Test
    public void testBookingFullyBookedFlight() {
        // Book all seats for flight 0
        manager.bookSeat(0, passenger1);
        manager.bookSeat(0, passenger2);
        
        // Now flight 0 should be fully booked, try to book another seat
        String bookingResult = manager.bookSeat(0, new NonMember("Alice", 29));
        
        // Should return the message "Sorry, that flight is fully booked"
        assertTrue(bookingResult.contains("fully booked"));
    }
}
