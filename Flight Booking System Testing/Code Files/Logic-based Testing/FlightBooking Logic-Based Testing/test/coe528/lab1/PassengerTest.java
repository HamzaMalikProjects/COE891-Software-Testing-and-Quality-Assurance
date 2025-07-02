package coe528.lab1;

import static org.junit.Assert.*;
import org.junit.Test;

public class PassengerTest {

    @Test
    public void testGetAge() {
        Passenger p = new Member("Amir", 24, 2);
        assertEquals(24, p.getAge());
    }

    @Test
    public void testGetAgeZero() {
        Passenger p = new NonMember("Baby", 0);
        assertEquals(0, p.getAge());
    }

    @Test
    public void testGetAgeSenior() {
        Passenger p = new NonMember("Grandma", 80);
        assertEquals(80, p.getAge());
    }
}
