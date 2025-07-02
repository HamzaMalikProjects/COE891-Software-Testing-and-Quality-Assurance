/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Syed Aiman Hussaini (500902560)
 */
public class Ticket {
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    
    public Ticket(Passenger p, Flight flight, double price) {
    
        passenger = p;
        this.flight = flight;
        this.price = price;
        
    }
    
    @Override
    
    public String toString() {
    
        return "Name: " + passenger.getName() + ", Flight Number: " + flight.getFlightNumber() + "\nDeparting from " + flight.getOrigin() +
                " and Arriving in " + flight.getDestination() + ". Departing on: " + flight.getDepartureTime() + ". \nOriginal Price: " +
                flight.originalPrice + ", Price after discount: " + passenger.applyDiscount(flight.getOriginalPrice()) + "\n";
    }
    
}
