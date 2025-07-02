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
public class Flight {
    
    private int flightNumber, capacity, numberOfSeatsLeft;
    private String origin, destination, departureTime;
    double originalPrice;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.numberOfSeatsLeft = capacity;
        
        if(origin.equals(destination) == true) {
            
            throw new IllegalArgumentException("Origin and Destination cannot be the same place.");
            
        }
        
        if(flightNumber < 0) {
            
            throw new IllegalArgumentException("Flight Number must be a positive integer.");
            
        }
        
        if(capacity <= 0) {
            
            throw new IllegalArgumentException("Capacity of plane cannot be negative or zero.");
            
        }
        
        if(originalPrice < 0) {
            
            throw new IllegalArgumentException("Original price of flight cannot be negative.");
            
        }    
    
    }
    
    public boolean bookASeat() {
        
        if(numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
            return true;
        }
        else
            return false;
        
    }
    
    public int getFlightNumber() {
        return flightNumber;
    }
    
    public void setFlightNumber(int a) {
        flightNumber = a;
    }
    
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int b) {
        capacity = b;
    }
    
    
    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }
    
    public void setNumberOfSeatsLeft(int c) {
        numberOfSeatsLeft = c;
    }
    
    
    public String getOrigin() {
        return origin;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    
    public String getDepartureTime() {
        return departureTime;
    }
    
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    
    
    public double getOriginalPrice() {
        return originalPrice;
    }
    
    public void setOriginalPrice(double price1) {
        originalPrice = price1;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Flight Number: " + getFlightNumber() + "; " + getOrigin() + " to " + getDestination() + ", " + getDepartureTime() + "; Original Price: $" + getOriginalPrice() + "\n";
    }
    
}
