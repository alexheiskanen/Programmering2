package lesson.arrays.exercises;

import java.util.Arrays;

public class Exercise8 {

	public static void main(String[] args) {
		int[] my_array1 = { 35, 19, 58, 13, 24, 99, 88, 68, 21, 42 };
		int[] my_array2 = new int[10];

		System.out.println("Copy: " + Arrays.toString(my_array1));

		for (int i = 0; i < my_array1.length; i++) {
			my_array2[i] = my_array1[i];
		}
		System.out.println("Paste: " + Arrays.toString(my_array2));
	}

}
