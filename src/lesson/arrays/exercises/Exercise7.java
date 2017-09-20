package lesson.arrays.exercises;

import java.util.Arrays;

public class Exercise7 {
	public static void main(String[] args) {
		int[] my_array1 = { 35, 19, 58, 13, 24, 99, 88, 68, 21, 42 };

		System.out.println("Before removing an element: " + Arrays.toString(my_array1));

		int removeIndex = 4;

		for (int i = removeIndex; i < my_array1.length - 1; i++) {
			my_array1[i] = my_array1[i + 1];
		}

		System.out.println("After removing the fourth element: " + Arrays.toString(my_array1));
	}
}
