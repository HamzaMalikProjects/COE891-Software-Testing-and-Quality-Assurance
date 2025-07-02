package question_2;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		if (str == null)
			throw new NullPointerException();
		int left = 0;
		int right = str.length() - 1;
		boolean result = true;
		while (left < right && result == true) {
			if (str.charAt(left) != str.charAt(right)) {
				result = false;
			}
			left ++;
			right --;
		}
		return result;
	}

}
