package lesson.arrays.exercises;

public class Exercise12 {

	public static void main(String[] args) {

		int[] my_array1 = { 35, 19, 58, 13, 24, 99, 88, 68, 21, 42 };
		int[] my_array2 = { 42, 20, 57, 12, 23, 99, 81, 61, 21, 41 };
		
		for (int i = 0; i < my_array1.length; i++) {
			for (int j = 0; j < my_array2.length; j++){
				if(my_array1[i] == my_array2[j]) {
					System.out.println(my_array1[i]+ "==" + my_array2[j]);
				}
			}
		}
	}

}
