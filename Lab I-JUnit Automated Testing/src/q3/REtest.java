package q3;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class REtest {
	RE r;
	@Before 
	public void init () {
		r = new RE();
	}
	@Test
	public void t1 () {
		assertTrue(r.checkPhoneNumber("(123)123-1234"));
	}
	@Test
	public void t2 () {
		assertTrue(r.checkPhoneNumber("(123) 123 - 1234"));
	}
	@Test
	public void t3 () {
		assertTrue(r.checkPhoneNumber(" 123 123 - 1234"));
	}
}
