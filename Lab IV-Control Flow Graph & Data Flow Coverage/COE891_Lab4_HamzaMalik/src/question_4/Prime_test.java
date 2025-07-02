package question_4;
import static org.junit.Assert.*;
import org.junit.Test;

public class Prime_test {
	@Test
    public void testPrintPrimesWithZero() {
        try {
            isPrime.printPrimes(0);
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testPrintPrimesWithOne() {
        try {
            isPrime.printPrimes(1);
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testPrintPrimesWithTwo() {
        try {
            isPrime.printPrimes(2);
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testPrintPrimesWithThree() {
        try {
            isPrime.printPrimes(3);
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

}



