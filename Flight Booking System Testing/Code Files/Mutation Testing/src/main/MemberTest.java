package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class MemberTest {
    @Test
    public void testApplyDiscountOver5Years() {
        Member member = new Member("Alice", 40, 6);
        assertEquals(400.00, member.applyDiscount(800.00), 0.001);
    }

    @Test
    public void testApplyDiscount1to5Years() {
        Member member = new Member("Bob", 35, 3);
        assertEquals(720.00, member.applyDiscount(800.00), 0.001);
    }

    @Test
    public void testApplyDiscountLessThan1Year() {
        Member member = new Member("Charlie", 25, 0);
        assertEquals(800.00, member.applyDiscount(800.00), 0.001);
    }

    @Test
    public void testApplyDiscountExactly5Years() {
        Member member = new Member("Dave", 45, 5);
        assertEquals(720.00, member.applyDiscount(800.00), 0.001);
    }
}