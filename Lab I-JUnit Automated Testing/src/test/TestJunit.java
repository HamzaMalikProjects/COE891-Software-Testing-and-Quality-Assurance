package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
	@Test
	public void testSetup() {
		String str = "I am done.";
		assertEquals("I am done.", str);
	}
}