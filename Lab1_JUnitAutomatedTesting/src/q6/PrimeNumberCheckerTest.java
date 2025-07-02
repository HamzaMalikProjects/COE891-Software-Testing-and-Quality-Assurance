package q6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	private int inputNumber;
	private boolean expectedResult;
	private PrimeNumberChecker prime;
	
	public PrimeNumberCheckerTest (int n, boolean b) {
		super();
		inputNumber = n;
		expectedResult = b;
	}
	
	@Before 
	public void init () {
		prime = new PrimeNumberChecker();
	}
	
	@Parameterized.Parameters
	public static Collection input () {
		return Arrays.asList(new Object [][] { {2, true}, {6, false}, {19, true}, {22, false}, {23, true} });
	}
	
	@Test
	public void test () {
		assertEquals(expectedResult, prime.PrimeNumberChecker(inputNumber));
	}
}