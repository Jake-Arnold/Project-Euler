package api;

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
	 * @param i
	 *            integer to check if prime.
	 * @return true if integer given prime.
	 * @author Jake Arnold
	 */

	public static boolean isPrime(int i) {
		return i != 2 && i % 2 != 0;
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

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(fibonacciNumber(i));
		}
	}
}
