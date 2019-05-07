package streams;

import java.util.stream.LongStream;

class PrimeNumbers {
	private static boolean isPrime(long val) {
		for(long i = 2; i <= val/2; i++) {
			if((val % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String []args) {
		long numOfPrimes = LongStream.rangeClosed(2, 100)
		                             .parallel()
		                             .peek(System.out::println)
		                             .filter(PrimeNumbers::isPrime)
		                             .peek(System.out::println)
		                             .count();
		System.out.println(numOfPrimes);
	}
}