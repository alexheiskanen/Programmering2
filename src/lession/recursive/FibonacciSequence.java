/**
 * 
 */
package lession.recursive;

/**
 * @author alex.heiskanen
 * Fibonacci sequence  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
 * 
 * is defined by the formula
 * 
 * F_n = F_(n−1)+F_(n−2) for n≥2, with F_0 = 0 and F_1 = 1;
 * 
 * Compute a recursive algorithm that solves the Fibonacci Sequence given a n 
 * from the user.
 */
public class FibonacciSequence {
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 14; i++)
		System.out.println(fibonacci(i));
	}

	public static long fibonacci(int n) {
		if (n == 0){
			return 0;
		} else if (n == 1){
			return 1;
		} else {
		return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
