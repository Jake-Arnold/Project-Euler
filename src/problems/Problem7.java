package problems;

import com.rakeyjakey.maths.Maths;

/**
 * Created by Jake on 6/4/14.
 */

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/


public class Problem7 {

    public static void main(String[] args) {

        // Start time variable.
        final long startTime = System.currentTimeMillis();

        // Output to signify that it is started.
        System.out.println("Started...\n");

        System.out.println("The 10001st prime number is: " + Maths.primeFromTerm(10001));

        // A message stating how long the process took and that it is finished
        // is printed.
        System.out.println("\nTook: " + (System.currentTimeMillis() - startTime)
                + "ms");

    }



}
