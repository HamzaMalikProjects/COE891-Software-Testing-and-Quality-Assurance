package q5;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FibonacciTest {
	private int inputNumber;
	private int expectedNumber;
	private Fibonacci fib;
	
	public FibonacciTest(int iN, int eN) {
		super();
		inputNumber = iN;
		expectedNumber = eN;
	}
	@Before
	public void init () {
		fib = new Fibonacci();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { {0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {7, 13}, {8, 21}, {9,34} });
	}
	@Test
	public void test () {
		assertEquals(expectedNumber, fib.compute(inputNumber));
	}
}
