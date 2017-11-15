/**
 * 
 */
package lession.recursive;

/**
 * @author alex.heiskanen
 *
 */
public class Fakultet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 16; i++)
		
		System.out.println(fak(i));
	}

	public static long fak(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n * fak(n - 1);
				
	}
	
}
