package euler;

/*The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143?

 */

public class Problem3 {

	public static void main(String[] args) {

		// The number to check for the largest prime factor of. As it is larger
		// than Integer.maxValue it must be a long.
		final long number = 600851475143L;

		// Start time variable.
		final long startTime = System.currentTimeMillis();

		// Output to signify that it is started.
		System.out.println("Started");

		// Loop through values starting at the square root of the variable
		// number. This is because the largest prime factor will always be less
		// than the square root of the number.
		// This will make checking quicker because we are looking for the
		// largest.
		for (long i = (long) Math.sqrt(number); i > 1; i--) {

			// This checks if it is a factor: if it divides by i exactly.
			if (number % i == 0) {

				// This checks if i is prime as we are looking for the largest
				// prime factor.
				if (isPrime(i)) {

					// This outputs the first value found as being a factor and
					// prime. The first factor in this case will always be the
					// largest as we are looping backwards.
					System.out.println("The largest prime factor is: " + i);

					// Once the largest prime factor is found it will break out
					// of the loop as it does not need to continue.
					break;
				}
			}
		}

		// A message stating how long the process took and that it is finished
		// is printed.
		System.out.println("Finished. Took: "
				+ (System.currentTimeMillis() - startTime) + " ms");

	}

	public static boolean isPrime(long l) {

		for (long i = 2; i < l - 1; i++) {
			if (l % i == 0)
				return false;
		}

		return true;
	}
}
