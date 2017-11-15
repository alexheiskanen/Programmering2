package lession.arrays.exercises;

import java.util.Arrays;

public class Exercise11 {

	public static void main(String[] args) {

		int[] my_array1 = { 35, 19, 58, 13, 24, 99, 88, 68, 21, 42 };
		
		int[] tempArray = new int[my_array1.length];
		
		for (int i = 0; i < my_array1.length; i++) {
			
			tempArray[i] = my_array1[my_array1.length - 1 - i];
			
			System.out.println(Arrays.toString(my_array1));
			
			System.out.println(Arrays.toString(tempArray));
		}
	}

}
