package lesson.arrays.exercises;

public class Exercise4 {

	public static void main(String[] args) {

		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		int sum = 0;

		for (int i = 0; i < my_array1.length; i++)
			sum = sum + my_array1[i];

		double average = sum / my_array1.length;

		System.out.println(average);
	}
}