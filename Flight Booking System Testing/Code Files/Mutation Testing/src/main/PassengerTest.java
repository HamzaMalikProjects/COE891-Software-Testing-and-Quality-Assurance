package main;


import static org.junit.Assert.*;
import org.junit.Test;

public class PassengerTest {
    @Test
    public void testPassengerConstructorAndGetters() {
        Passenger passenger = new Member("Harry", 30);
        assertEquals("Harry", passenger.getName());
        assertEquals(30, passenger.getAge());
    }

    @Test
    public void testPassengerSetters() {
        Passenger passenger = new NonMember("Ivy", 25);
        passenger.setName("Ivy Jr.");
        passenger.setAge(26);
        assertEquals("Ivy Jr.", passenger.getName());
        assertEquals(26, passenger.getAge());
    }
}