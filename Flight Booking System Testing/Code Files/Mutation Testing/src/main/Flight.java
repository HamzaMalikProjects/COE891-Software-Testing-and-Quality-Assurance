package main;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int numberOfSeatsLeft;
    double originalPrice;

    // Constructor
    public Flight(int flightNumber, String origin, String destination, String departureTime, int numberOfSeatsLeft, double originalPrice) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.numberOfSeatsLeft = numberOfSeatsLeft;
        this.originalPrice = originalPrice;
    }

    // Getters and setters
    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setNumberOfSeatsLeft(int seatsLeft) {
        this.numberOfSeatsLeft = seatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    // Method to book a seat
    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + ", Origin: " + origin + ", Destination: " + destination + ", Departure: " + departureTime;
    }
}
