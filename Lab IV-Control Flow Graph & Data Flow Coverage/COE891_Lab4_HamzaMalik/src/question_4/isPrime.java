package question_4;

public class isPrime {
	
	public static void printPrimes (int n) {
		int curPrime; // Value currently considered for primeness
		int numPrimes; // Number of primes found so far.
		boolean isPrime; // Is curPrime prime?
		int[] primes = new int [100]; // The list of prime numbers.
		// Initialize 2 into the list of primes.
		primes[0] = 2;
		numPrimes = 1;
		curPrime = 2;
		while (numPrimes < n) {
			curPrime++; // next number to consider ...
			isPrime = true;
			for (int i = 0; i <= numPrimes-1; i++) { // for each previous prime.
				if (isDivisible(primes[i], curPrime)) { /* Found a  
                                 divisor, curPrime is not prime. */
					isPrime = false;
				break; // out of loop through primes.
				}
			}
			if (isPrime) { // save it!
				primes[numPrimes] = curPrime;
				numPrimes++; }
		} // End while
	 // Print all the primes out.
	for (int i = 0; i <= numPrimes-1; i++)
		System.out.println ("Prime: " + primes[i]);
	} // end printPrimes
	
	public static boolean isDivisible(int a, int b) {
	    // Check if 'b' is divisible by 'a'
	    return b % a == 0;
	}

}
