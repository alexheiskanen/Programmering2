package lession.arrays.exercises;

import java.util.Arrays;

public class Exercise10 {

	static int max;

	static int min;

	public static void max_min(int my_array1[]) {

		max = my_array1[0];

		min = my_array1[0];

		int len = my_array1.length;

		for (int i = 1; i < len - 1; i = i + 2) {
			if (i + 1 < len) {
				if (my_array1[i] > max)
					max = my_array1[i];
				if (my_array1[i] < min)
					min = my_array1[i];
			}
			if (my_array1[i] > my_array1[i + 1]) {
				if (my_array1[i] > max)
					max = my_array1[i];
				if (my_array1[i + 1] < min)
					min = my_array1[i];
			}
			if (my_array1[i] < my_array1[i + 1]) {
				if (my_array1[i] < min)
					min = my_array1[i];
				if (my_array1[i + 1] > max)
					max = my_array1[i];
			}
		}
	}

	public static void main(String[] args) {

		int[] my_array1 = { 35, 19, 58, 13, 24, 99, 88, 68, 21, 42 };
		max_min(my_array1);
		System.out.println("Original Array: " + Arrays.toString(my_array1));
		System.out.println("Maximum value for the original array = " + max);
		System.out.println("Minimum value for the original array = " + min);
	}

}
