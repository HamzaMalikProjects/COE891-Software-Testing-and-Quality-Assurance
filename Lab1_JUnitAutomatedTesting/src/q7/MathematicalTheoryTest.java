package q7;

import static org.junit.Assert.assertTrue;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MathematicalTheoryTest {
//	@DataPoints
//	public static int[] val1 () {
//		return new int[] {1, 2, 307, 400567};
//	}
	@DataPoints
	public static int[] val2 () {
		return new int[] {0, -1, -10, -1234, 1, 10, 6789};
	}
//	@DataPoints
//	public static int[] val3 () {
//		return new int[] {0, -1, -10, -1234, 1, 10, 6789, Integer.MAX_VALUE, Integer.MIN_VALUE};
//	}
	@Theory
	public void theo1(Integer a, Integer b) {
		Assume.assumeTrue(a > 0 && b > 0);
		assertTrue(a + b > a);
		assertTrue(a + b > b);
	}
	@Theory
	public void theo2(Integer a, Integer b) {
		assertTrue(a + b == b + a);
	}
}