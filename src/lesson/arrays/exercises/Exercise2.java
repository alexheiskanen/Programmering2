package lesson.arrays.exercises;

import java.util.stream.*;

public class Exercise2 {

	public static void main(String[] args) {
		/**
		 * Exercise 2
		 */
		// Exercise 2
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		
		int sumOfArray = 0;
		for (int i = 0; i < my_array1.length; i++) {
			sumOfArray += my_array1[i];
		}
		System.out.println(sumOfArray);
		/**
		 * Better version
		 */
		int sum = IntStream.of(my_array1).sum();
		System.out.println(sum);
	}

}
