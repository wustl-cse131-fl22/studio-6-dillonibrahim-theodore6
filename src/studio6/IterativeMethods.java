package studio6;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class IterativeMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {

		if (n == 0) {
			return 0;
		}
		else {
			return 1/(Math.pow(2, n)) + geometricSum(n-1);  
		}
		
		
	}

	/**
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {			
		if (q == 0) {
			return p;
		}
		else {
			return gcd(q, p % q);
		}
	}

	/**
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int helper(int x) {
		
	return 1;
	
	
	}
	
	public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];
		if (array.length > 0) {
			int lastIndex = array.length - 1;
			for (int index = 0; index <= array.length / 2; ++index) {
				int mirrorIndex = lastIndex - index;
				// note:
				// since we read from array and write to reversed
				// we do not need to use a temp variable
				reversed[index] = array[mirrorIndex];
				reversed[mirrorIndex] = array[index];
			}


			if (array.length > 0 || array.length == 1) {
				if (array.length == 0) {
					return new int [0];
				}
				else {
					return new int [0];
				}
			}
			else {
				return toReversed();
			}



		}
		return reversed;
	}
}
