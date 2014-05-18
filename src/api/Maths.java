package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maths {

	/**
	 * @param i
	 *            integer to check if even.
	 * @return true if integer given is even.
	 * @author Jake Arnold
	 */

	public static boolean isEven(int i) {
		return i % 2 == 0;
	}

	/**
	 * @param i
	 *            double to check if whole.
	 * @return true if integer given is a whole number (integer).
	 * @author Jake Arnold
	 */

	public static boolean isInteger(double i) {
		return i == Math.round(i);
	}

	/**
	 * @param l
	 *            integer to check if prime.
	 * @return true if integer given prime.
	 * @author Jake Arnold
	 */

	public static boolean isPrime(long l) {

		for (long i = 2; i < l - 1; i++) {
			if (l % i == 0)
				return false;
		}

		return true;
	}
	
	/**
	 * @param i
	 *            integer to check if square number.
	 * @return true if integer given is a square number.
	 * @author Jake Arnold
	 */

	public static boolean isSquareNumber(int i) {
		return isInteger(Math.sqrt(i));
	}

	/**
	 * @param i
	 *            integer to check if cube number.
	 * @return true if integer given is a cube number.
	 * @author Jake Arnold
	 */
	public static boolean isCubeNumber(int i) {
		return isInteger(Math.cbrt(i));
	}

	/**
	 * @param i
	 *            integer that we will be checking the multiple of.
	 * @param j
	 *            integer to check if is a multiple of i.
	 * @return true if integer j is a multple of integer i.
	 * @author Jake Arnold
	 */
	public static boolean isMultipleOf(int i, int j) {
		return j % i == 0;
	}

	/**
	 * @param term
	 *            the nth term of the sequence that you with to output.
	 * @return the fibonacci number located at the nth term.
	 * @author Jake Arnold
	 */
	public static int fibonacciNumber(int term) {

		if(term == 0 || term > 46){
			throw new IllegalArgumentException("Value not between 1 and 46.");
		}
		
			
		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 0; i < term; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	
	public static boolean isPalindromicNumber(int i) {

		// This converts i to a string.
		final String number = String.valueOf(i);

		// This creates a list to hold the characters of the number.
		List<Character> digitsCorrectWay = new ArrayList<Character>();

		// This populates the list with the characters.
		for (char c : number.toCharArray()) {
			digitsCorrectWay.add(c);
		}

		// This creates a clone of the initial list that is holding the
		// characters.
		List<Character> digitsReversed = new ArrayList<Character>(
				digitsCorrectWay);

		// This reverses the copy of the list.
		Collections.reverse(digitsReversed);

		// If the characters of the number are equal both reversed and the
		// normal way round then return true.
		return digitsCorrectWay.equals(digitsReversed);
	}
	
	public static boolean isEvenlyDivisibleBy(int value, int... integers) {

		// The integers specified are looped through, returning false if the
		// value divided by any of these gives a remainder.
		for (int i : integers) {
			if (value % i != 0) {
				return false;
			}
		}
		return true;

	}

}
