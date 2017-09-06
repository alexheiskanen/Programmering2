package lesson.arrays.exercises;

import java.util.Arrays; 

public class Exercise3 {

	public static void main(String[] args) {
		
		char[][] names = new char[10][10];
		for (int i = 0; i < names.length; i++) {
			Arrays.fill(names[i], '-');
		}
		
		for (int rad = 0; rad < names.length; rad++) {
			for (int col = 0; col < names[rad].length; col++){
				System.out.print(names[rad][col] + " ");
			}
			System.out.print("\n");
		}
	}

}
