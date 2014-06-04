package problems;


import com.rakeyjakey.maths.Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*  A palindromic number reads the same both ways.
 * 
 *  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 � 99.
 *  Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {

	public static void main(String[] args) {

		// This is a list to hold all of the palindromes found.
		final List<Integer> palindromeList = new ArrayList<Integer>();

		// Start time variable.
		final long startTime = System.currentTimeMillis();

		// Output to signify that it is started.
		System.out.println("Started");

		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {

				// If the result of i * j is a palindrome then it is added to
				// the list of palindromes.
				if (Maths.isPalindromicNumber(i * j))
					palindromeList.add(i * j);

			}
		}

		// This sorts the list of palindromes by numerical order from largest to
		// smallest.
		Collections.sort(palindromeList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}

		});

		// This prints out the largest palindrome from the list by getting the
		// integer at index 0.
		System.out
				.println("The largest palindromic number created from the multiplication of two 3-digit numbers is "
						+ palindromeList.get(0) + ".");

		// A message stating how long the process took and that it is finished
		// is printed.
		System.out.println("Took: " + (System.currentTimeMillis() - startTime)
				+ "ms");
	}

	
}
