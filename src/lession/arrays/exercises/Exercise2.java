package lession.arrays.exercises;

import java.util.stream.*;

public class Exercise2 {
	/**
	 * Exercise 2
	 */
	public static void main(String[] args) {

		// Exercise 2
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		
		int sum = 0;
		for (int i = 0; i < my_array1.length; i++) {
			sum += my_array1[i];
		}
		System.out.println(sum);
		
		// better version imo
		int summ = IntStream.of(my_array1).sum();
		System.out.println(summ);
	}

}
