package q2test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import q2.q2Function;

public class q2tester {
	
	q2Function q;
	@Before
	public void init () {
		q = new q2Function();
	}
	@Test
	public void testFuncAB () {
		assertEquals(1, q.func(2, 3));
	}
	@Test
	public void testFuncBA () {
		assertEquals(1, q.func(3, 2));
	}
	@Test
	public void testFuncEq () {
		assertEquals(0, q.func(2, 2));
	}
}
