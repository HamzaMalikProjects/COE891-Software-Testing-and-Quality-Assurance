package q5;

public class Fibonacci {
	public int compute (int n) {
		int result = 0;
		if (n <= 1) {
			result = n;
		} else {
			result = compute(n-1) + compute(n-2);
		}
		return result;
	}
}