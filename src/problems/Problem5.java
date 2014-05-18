package problems;

import api.Maths;

/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/

public class Problem5 {

	public static void main(String[] args) {

		// Start time variable.
		final long startTime = System.currentTimeMillis();

		// Output to signify that it is started.
		System.out.println("Started...");

		// I have constructed this loop in such a way that it will continue
		// forever until it finds a value that is evenly divisible by all the
		// numbers from 1 to 20.
		for (int i = 1; true; i++) {

			// Declaring a new integer array was not necessary, but I did it
			// purely so that the values specified are more obvious when
			// reading.
			if (Maths.isEvenlyDivisibleBy(i, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,
					10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 })) {

				// If i is evenly divisible by the numbers 1 to 20 then the
				// console prints the value and breaks out of the loop.
				System.out
						.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: "
								+ i + ".");
				break;
			}
		}

		// A message stating how long the process took and that it is finished
		// is printed.
		System.out.println("Took: " + (System.currentTimeMillis() - startTime)
				+ "ms");
	}

	
}
