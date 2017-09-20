package lesson.arrays.exercises;

import java.util.Arrays;

public class Exercise9 {

	public static void main(String[] args) {

		int[] my_array1 = { 35, 19, 58, 13, 24, 99, 88, 68, 21, 42 };

		int indexPosition = 3;
		int newValue = 17;

		System.out.println("Before: " + Arrays.toString(my_array1));

		for (int i = my_array1.length - 1; i > indexPosition; i--) {
			my_array1[i] = my_array1[i - 1];
		}
		my_array1[indexPosition] = newValue;
		System.out.println("After: " + Arrays.toString(my_array1));
	}

}
