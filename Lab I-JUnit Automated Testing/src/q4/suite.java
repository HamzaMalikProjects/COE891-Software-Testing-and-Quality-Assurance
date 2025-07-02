package q4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import q2.TriangleTest;
import q3.REtest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TriangleTest.class,
	REtest.class})
public class suite {

}
