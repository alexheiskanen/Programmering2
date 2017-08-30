package lession.arrays;

public class MultiDisArrays {

	public static void main(String[] args) {
		String[][] names = {
				{"Mr. ", "Mrs. ", "Ms. "},
				{"Jonas ", "Amanda ", "Penny "}
		};

		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][2] + names[1][1]);
		System.out.println(names[0][1] + names[1][2]);
		System.out.println(names[0][1] + names[1][1]);
		System.out.println(names[0][2] + names[1][2]);
		
		System.out.println(names[0].length);
		
		for (int i = 0; i < names[1].length; i++) {
			if(names[1][i].equals("Jonas ")) {
				names[1][i] = "Fredrik";
			}
			names[0][i] = "Satan";
		}
		
		System.out.println(names[1][0]);
	}

}


