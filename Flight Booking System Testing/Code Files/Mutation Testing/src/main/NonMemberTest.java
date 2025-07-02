package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class NonMemberTest {
    @Test
    public void testApplyDiscountSenior() {
        NonMember senior = new NonMember("Eve", 66);
        assertEquals(720.00, senior.applyDiscount(800.00), 0.001);
    }

    @Test
    public void testApplyDiscountNotSenior() {
        NonMember adult = new NonMember("Frank", 40);
        assertEquals(800.00, adult.applyDiscount(800.00), 0.001);
    }

    @Test
    public void testApplyDiscountExactly65() {
        NonMember borderline = new NonMember("Grace", 65);
        assertEquals(800.00, borderline.applyDiscount(800.00), 0.001);
    }
}