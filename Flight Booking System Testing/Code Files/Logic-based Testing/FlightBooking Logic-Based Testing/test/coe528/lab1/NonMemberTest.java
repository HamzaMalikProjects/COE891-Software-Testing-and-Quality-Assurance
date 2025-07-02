package coe528.lab1;

import static org.junit.Assert.*;
import org.junit.Test;

public class NonMemberTest {

    @Test
    public void testSeniorDiscountApplied() {
        NonMember senior = new NonMember("Paul", 70);
        assertEquals(90.0, senior.applyDiscount(100.0), 0.001); // 10% off
    }

    @Test
    public void testNoDiscountAt65() {
        NonMember adult = new NonMember("Sam", 65);
        assertEquals(100.0, adult.applyDiscount(100.0), 0.001);
    }

    @Test
    public void testNoDiscountBelow65() {
        NonMember young = new NonMember("Nina", 40);
        assertEquals(100.0, young.applyDiscount(100.0), 0.001);
    }
}

