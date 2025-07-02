package coe528.lab1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicketToStringTest {

    @Test
    public void testTicketToStringIncludesKeyDetails() {
        Flight flight = new Flight(501, "NYC", "LA", "5:00 PM", 20, 500.0);
        Member passenger = new Member("Lina", 30, 6);  // Eligible for 50% discount
        double discountedPrice = passenger.applyDiscount(flight.getOriginalPrice());

        Ticket ticket = new Ticket(passenger, flight, discountedPrice);
        String result = ticket.toString();

        assertTrue(result.contains("Lina"));            // Passenger name
        assertTrue(result.contains("Flight Number: 501")); // Flight number
        assertTrue(result.contains("250.0"));           // Discounted price
        assertTrue(result.contains("NYC"));             // Origin
        assertTrue(result.contains("LA"));              // Destination
        assertTrue(result.contains("5:00 PM"));         // Time
    }
}
