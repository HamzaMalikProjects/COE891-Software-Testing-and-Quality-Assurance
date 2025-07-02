package q8;
import q6.PrimeNumberChecker;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class q6JUnitTheories {
	
	PrimeNumberChecker prime;
	@Before
	public void init () {
		prime = new PrimeNumberChecker();
	}
	@DataPoints
	public static Object[][] val1 () {
		return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
	}
	@Theory
	public void theo (Object[] a) {
		assertTrue(prime.PrimeNumberChecker((int) a[0]) == (boolean)a[1]);
	}
}