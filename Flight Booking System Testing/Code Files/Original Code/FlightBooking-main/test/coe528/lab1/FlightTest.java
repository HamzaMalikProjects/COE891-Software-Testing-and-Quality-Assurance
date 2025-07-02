/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Syed Aiman Hussaini (500902560)
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of constructor of class Flight with valid parameters.
     */
    @Test
    public void testConstructor() {
        System.out.println("Test the Constructor");
        boolean check = false;
        Flight f1 = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        if(f1.getFlightNumber() == 0 && f1.getOrigin().equals("Toronto") && f1.getDestination().equals("London") && f1.getDepartureTime().equals("Feb 5 @ 8:36") && f1.getCapacity() == 470 && f1.getOriginalPrice() == 652.26)
            check = true;
        boolean expResult = true;
        assertEquals(expResult, check);
    }
    
    /**
     * Test of constructor of class Flight using invalid parameters; the test passes if an IllegalArgumentException is thrown.
     */
    @Test
    public void testInvalidConstructor() {
        System.out.println("Test the constructor with invalid parameters");
        boolean check = false;
        try {
        Flight instance = new Flight(0, "Toronto", "Toronto", "Feb 5 @ 8:36", 470, 652.26); }
        catch(IllegalArgumentException f) {
        check = true;
        }
        boolean expResult = true;
        assertEquals(expResult, check);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        int expResult = 0;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int a = 0;
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        instance.setFlightNumber(a);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 10, 652.26);
        int expResult = 10;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int b = 0;
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        instance.setCapacity(b);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        int expResult = 470;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int c = 0;
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        instance.setNumberOfSeatsLeft(c);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Calgary";
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        instance.setOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        String expResult = "London";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Tokyo";
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        String expResult = "Feb 5 @ 8:36";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "Tokyo";
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        instance.setDepartureTime(departureTime);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        double expResult = 652.26;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double price1 = 1250.17;
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        instance.setOriginalPrice(price1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        String expResult = "Flight Number: 0; Toronto to London, Feb 5 @ 8:36; Original Price: $652.26\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
