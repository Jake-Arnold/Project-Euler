package problems;


import com.rakeyjakey.maths.Maths;

/**
 * Created by Jake on 6/4/14.
 */

/*The sum of the squares of the first ten natural numbers is,

1sq + 2sq + ... + 10sq = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)sq = 55sq = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/

public class Problem6 {

    public static void main(String[] args) {

        // Start time variable.
        final long startTime = System.currentTimeMillis();

        // Output to signify that it is started.
        System.out.println("Started...\n");

        int sumOfSquares = Maths.sumOfSquares(100);
        int squareOfSum = Maths.squareOfSum(100);

        System.out.println("The Sum of the Squares of the first 1000 natural numbers is: " + sumOfSquares);
        System.out.println("The Square of the Sum of the first 1000 natural numbers is: " + squareOfSum);
        System.out.println("The difference between the sqs, sos sum of the squares of the first one hundred natural numbers and the square of the sum is: " + Maths.calculateDifference(sumOfSquares, squareOfSum));

        // A message stating how long the process took and that it is finished
        // is printed.
        System.out.println("\nTook: " + (System.currentTimeMillis() - startTime)
                + "ms");
    }


}
