package coe528.lab1;

import static org.junit.Assert.*;
import org.junit.Test;

public class MemberTest {

    @Test
    public void testDiscountAboveFiveYears() {
        Member member = new Member("John", 35, 6);
        assertEquals(50.0, member.applyDiscount(100.0), 0.001);
    }

    @Test
    public void testDiscountBetweenTwoAndFiveYears() {
        Member member = new Member("Jane", 28, 3);
        assertEquals(90.0, member.applyDiscount(100.0), 0.001);
    }

    @Test
    public void testNoDiscountOneYear() {
        Member member = new Member("Doe", 40, 1);
        assertEquals(100.0, member.applyDiscount(100.0), 0.001);
    }

    @Test
    public void testNoDiscountZeroYears() {
        Member member = new Member("New", 22, 0);
        assertEquals(100.0, member.applyDiscount(100.0), 0.001);
    }
}

