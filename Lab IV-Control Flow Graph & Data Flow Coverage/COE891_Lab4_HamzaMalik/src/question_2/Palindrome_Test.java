package question_2;

import static org.junit.Assert.*;
import org.junit.Test;



public class Palindrome_Test {
	Palindrome p = new Palindrome();

	@Test (expected = NullPointerException.class)
	public void testPalindromeNull() {
		String str = null;
		Palindrome.isPalindrome(str);
	}
	@Test
	public void testPalindrome1() {
		String str = "ba";
		assertFalse(Palindrome.isPalindrome(str));
	}
	@Test
	public void testPalindrome2() {
		String str = "baaa";
		assertFalse(Palindrome.isPalindrome(str));
	}
}
