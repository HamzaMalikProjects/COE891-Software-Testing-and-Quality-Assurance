package main;

import java.util.ArrayList;

public class Manager {
    ArrayList<Flight> flightArray = new ArrayList<>();

    public void createFlights(Flight f) {
        flightArray.add(f);
    }

    public String displayAvailableFlights(String origin, String destination) {
        StringBuilder result = new StringBuilder("List of Available Flights: \n");
        boolean flightsFound = false;

        for (Flight flight : flightArray) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination) && flight.getNumberOfSeatsLeft() > 0) {
                result.append(flight.toString()).append("\n");
                flightsFound = true;
            }
        }

        if (!flightsFound) {
            return "No flights available.";
        }

        return result.toString();
    }

    public Flight getFlight(int flightNumber) {
        for (Flight flight : flightArray) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    public String bookSeat(int flightNumber, Passenger p) {
        Flight flight = getFlight(flightNumber);
        if (flight == null) {
            return "Flight not found.";
        }
        
        if (flight.bookASeat()) {
            // Assuming Ticket is another class that creates the ticket
            Ticket ticket = new Ticket(p, flight, p.applyDiscount(flight.getOriginalPrice()));
            return "Ticket booked successfully.\n" + ticket.toString();
        } else {
            return "Sorry, that flight is fully booked.";
        }
    }
}
